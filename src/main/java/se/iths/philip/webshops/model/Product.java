package se.iths.philip.webshops.model;

public abstract class Product {
    private int articleNumber;
    private String title;
    private double price;
    private String description;


    public Product(int articleNumber, String title, double price, String description) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

//    public abstract String category(String Bok, String Elektronik, String Kläder) {
//        System.out.println("Kategorier ");
//    }

    public abstract String category();
}
