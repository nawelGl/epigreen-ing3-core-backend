package fr.upec.episen.epigreen.business_core_backend.controllers.product;

import fr.upec.episen.epigreen.business_core_backend.models.product.Product;
import fr.upec.episen.epigreen.business_core_backend.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id) {

        return new ResponseEntity<>(productService.findByIdProduct(id), HttpStatus.OK);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}