package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Parameter 0 of constructor in uk.ac.westminster.products_api.ProductController required a bean of type 'uk.ac.westminster.products_api.ProductService' that could not be found.
//
//Action:
//Consider defining a bean of type 'uk.ac.westminster.products_api.ProductService' in your configuration.
//
//Process finished with exit code 1
@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public void deleteProduct(Long id) {
        repository.findById(id);
        repository.delete(id);
    }

//    public List<Product> findByName(String name) {
//        return products.stream()
//                .filter(p -> p.getName().contains(name))
//                .toList();
//    }

    //    public List<String> getAllSummaries() {
//
//        List<String> summaries = new ArrayList<>();
//
//        for (Product p : products) {
//            summaries.add(p.getSummary());
//        }
//        return summaries;
//    }

}
