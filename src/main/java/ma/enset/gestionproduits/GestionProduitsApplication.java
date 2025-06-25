package ma.enset.gestionproduits;

import ma.enset.gestionproduits.entites.Product;
import ma.enset.gestionproduits.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionProduitsApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestionProduitsApplication.class, args);

    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                            .name("Laptop")
                            .price(5000)
                            .quantity(10)
                    .build());

            productRepository.save(Product.builder()
                    .name("Iphone")
                    .price(4500)
                    .quantity(11)
                    .build());

            productRepository.save(Product.builder()
                    .name("Imprimante")
                    .price(1000)
                    .quantity(5)
                    .build());
            productRepository.findAll().forEach(p -> System.out.println(p.toString()));
        };
    }
}
