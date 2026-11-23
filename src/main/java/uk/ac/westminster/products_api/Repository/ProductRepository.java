package uk.ac.westminster.products_api.Repository;

import uk.ac.westminster.products_api.Product;

import java.util.List;
import java.util.Optional;


public interface ProductRepository {

    List<Product> findAll();
    Optional<Product>
    findById(Long id);
    Product save(Product product);
    void delete(Long id);


    // private List<Product> store = new ArrayList<>();
    //
    // java: modifier private not allowed here
    //java: cannot find symbol
    //  symbol:   class ArrayList
    //  location: interface uk.ac.westminster.products_api.Repository.ProductRepository

}
