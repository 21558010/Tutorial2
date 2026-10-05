package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price ) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getID() {return id;}

    public String getName() {return name;}
    /* I think when getName is missing it will be skipped and not appear in the response
    I would notice a field missing by checking my logic output because it is not a error
    that produces a message like a syntax error.
    */
    public double getPrice() {return price;}
     */

}
