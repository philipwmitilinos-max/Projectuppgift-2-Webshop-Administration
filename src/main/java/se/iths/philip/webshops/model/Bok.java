package se.iths.philip.webshops.model;

public class Bok extends Product {
    private String author;
    private int sidor;

    public Bok(int articleNumber, String title, double price, String description, String author, int sidor) {
        super(articleNumber, title, price, description);
        this.author = author;
        this.sidor = sidor;
    }

    @Override
    public String category() {
        return "BÖCKER";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKategori: " + category() +
                "\nFörfattare: " + author +
                "\nAntal sidor: " + sidor;
    }

}
