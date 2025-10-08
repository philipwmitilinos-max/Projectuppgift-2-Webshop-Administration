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

    public int getArticleNumber() {
        return articleNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public abstract String category();

    @Override
    public String toString() {
        return "Artikelnummer: " + articleNumber +
                "\nTitel: " + title +
                "\nPris: " + price + " kr" +
                "\nBeskrivning: " + description;
    }
}
