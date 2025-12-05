package fr.upec.episen.epigreen.business_core_backend.services.product;

import fr.upec.episen.epigreen.business_core_backend.models.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.upec.episen.epigreen.business_core_backend.repositories.product.ProductRepository;
import java.util.Optional;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
  
    public Product findByIdProduct(long idProduct) {
        Optional<Product> product = productRepository.findById(idProduct);
        return product.orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
