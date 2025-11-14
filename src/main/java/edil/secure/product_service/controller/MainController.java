package edil.secure.product_service.controller;

import edil.secure.product_service.service.ProductService;
import edil.secure.product_service.service.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final ProductService productService;
    private final WarehouseService warehouseService;

    public MainController(ProductService productService, WarehouseService warehouseService) {
        this.productService = productService;
        this.warehouseService = warehouseService;
    }

    @GetMapping("")
    public String getAllProducts(Model model) {
        model.addAttribute("productCount",productService.findQuantity());
        model.addAttribute("warehouseCount",warehouseService.findQuantity());
        return "mainPage";
    }

}
