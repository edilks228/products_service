package edil.secure.product_service.controller;

import edil.secure.product_service.entity.Product;
import edil.secure.product_service.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/getAll")
    public String getAllProducts(Model model) {
        List<Product> ss = productService.findAll();
        for (Product p : ss) {
            System.out.println(p.getName() + " " +p.getCategory().getName());
        }
//        ss.forEach(s->
//            System.out.println(s.name + " " + s.getCategory().getName()));
        model.addAttribute("products",productService.findAll());
        return "products/allproductsPage";
    }
}
