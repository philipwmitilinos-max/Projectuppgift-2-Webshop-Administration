package se.iths.philip.webshops.model;

public class Kläder extends Product {
    private String size;
    private String coloer;

    public Kläder(int articleNumber, String title, double price, String description, String size, String coloer) {
        super(articleNumber, title, price, description);
        this.size = size;
        this.coloer = coloer;
    }

    @Override
    public String category() {
        return "KLÄDER";
    }
}
