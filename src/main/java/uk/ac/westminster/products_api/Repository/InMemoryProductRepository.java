package uk.ac.westminster.products_api.Repository;

import org.springframework.stereotype.Repository;
import uk.ac.westminster.products_api.DigitalProduct;
import uk.ac.westminster.products_api.PhysicalProduct;
import uk.ac.westminster.products_api.Product;

import java.util.*;

@Repository
public class InMemoryProductRepository implements ProductRepository{

    private final Map<Long, Product> store = new HashMap<>();

    private Long nextId = 1L;

    public InMemoryProductRepository() {
        save(new DigitalProduct(nextId++, "The Legend of Zelda: Sacred Shield (Digital Copy)",
                49.99, "neentendo/P-Store/Zelda-Titles/Sacred-Shield.moe", 30000 ));

        save(new PhysicalProduct(nextId++, "Neentendo GameCuboid", 349.99,
                20.00," 30cm x 15cm x 15cm"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Product save(Product product) {
        if (product.getId() == null)
            product.setId(nextId++);
        store.put(product.getId(), product);
        return product;
    }

    @Override
    public void delete(Long id) {
        store.remove(id);
    }





}
