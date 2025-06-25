package ma.enset.gestionproduits.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//second-method
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("mohammed").password(passwordEncoder().encode("1234")).roles("USER").build(),
                User.withUsername("othmane").password(passwordEncoder().encode("1234")).roles("USER").build(),
                User.withUsername("dalal").password(passwordEncoder().encode("1234")).roles("USER","ADMIN").build()

        );
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity) throws Exception {

        return httpsecurity
                .formLogin(Customizer.withDefaults())
                //first-methode
                //.authorizeHttpRequests(aur -> aur.requestMatchers("/user/**").hasRole("USER"))
                //.authorizeHttpRequests(aur -> aur.requestMatchers("/admin/**").hasRole("ADMIN"))
                .authorizeHttpRequests(aur -> aur.requestMatchers("/public/**").permitAll())
                .authorizeHttpRequests(a -> a.anyRequest().authenticated())
                .exceptionHandling(exh -> exh.accessDeniedPage("/notAuthorized"))
                .build();
    }
}
