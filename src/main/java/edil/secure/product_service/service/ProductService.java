package edil.secure.product_service.service;

import edil.secure.product_service.entity.Product;
import edil.secure.product_service.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Integer findQuantity() {
        return productRepository.findAll().size();
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
