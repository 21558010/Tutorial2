package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.Exception.ProductNotFoundException;

import java.util.List;

@RestController
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getALLProducts() {return productService.getAllProducts();}

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

//    @GetMapping ("/products/search")
//    public List<Product> search(@RequestParam String name) {
//        return productService.findByName(name);
//    }
//
//    @GetMapping("/products/summaries")
//    public List<String> getSummaries() {
//        return productService.getAllSummaries();
//    }
}
