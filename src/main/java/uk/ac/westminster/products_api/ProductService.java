package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    private Long nextId = 1L;

    public ProductService() {

        products.add(new DigitalProduct(nextId++, "The Legend of Zelda: Sacred Shield (Digital Copy)",
                49.99, "neentendo/P-Store/Zelda-Titles/Sacred-Shield.moe", 30000 ));

        products.add(new PhysicalProduct(nextId++, "Neentendo GameCuboid", 349.99,
                                                   20.00," 30cm x 15cm x 15cm"));

    }


    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);   // use the value, then add one
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }


    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));

    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

}
