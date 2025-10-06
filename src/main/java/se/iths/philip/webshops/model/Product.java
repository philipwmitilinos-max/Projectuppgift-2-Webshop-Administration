package se.iths.philip.webshops.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private int articleNumber;
    private String title;
    private double price;
    private String description;
    private List<Product> productList;

    public Product(int articleNumber, String title, double price, String description) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
        this.description = description;
        productList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public abstract void category(Bok, Elektronik, Kläder) {

    }
}
