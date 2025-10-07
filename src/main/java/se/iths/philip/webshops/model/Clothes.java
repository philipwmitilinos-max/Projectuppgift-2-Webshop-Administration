package se.iths.philip.webshops.model;

public class Clothes extends Product {
    private String size;
    private String coloer;

    public Clothes(int articleNumber, String title, double price, String description, String size, String coloer) {
        super(articleNumber, title, price, description);
        this.size = size;
        this.coloer = coloer;
    }

    @Override
    public String category() {
        return "KLÄDER";
    }
}
