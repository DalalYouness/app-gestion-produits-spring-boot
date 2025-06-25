package ma.enset.gestionproduits.web;

import ma.enset.gestionproduits.entites.Product;
import ma.enset.gestionproduits.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("productList",products );
        return "products";
    }
    @GetMapping("/")
    public String home(Model model) {
        return "redirect:/index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam (name = "id") Long id) {
        productRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/newProduct")
    public String newProduct(Model model) {
        model.addAttribute("product",new Product());
        return "new-product";
    }
}
