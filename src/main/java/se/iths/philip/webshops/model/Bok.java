package se.iths.philip.webshops.model;

public class Bok extends Product {
    private String auther;
    private int sidor;

    public Bok(int articleNumber, String title, double price, String description, String auther, int sidor) {
        super(articleNumber, title, price, description);
        this.auther = auther;
        this.sidor = sidor;
    }

    @Override
    public String category() {
        return "BÖCKER";
    }
}
