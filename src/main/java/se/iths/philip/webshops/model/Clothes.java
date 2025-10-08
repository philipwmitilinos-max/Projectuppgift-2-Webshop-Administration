package se.iths.philip.webshops.model;

public class Clothes extends Product {
    private String size;
    private String color;

    public Clothes(int articleNumber, String title, double price, String description, String size, String color) {
        super(articleNumber, title, price, description);
        this.size = size;
        this.color = color;
    }

    @Override
    public String category() {
        return "KLÄDER";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKategori: " + category() +
                "\nStorlek: " + size +
                "\nFärg: " + color;
    }

}
