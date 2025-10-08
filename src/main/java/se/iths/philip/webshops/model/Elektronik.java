package se.iths.philip.webshops.model;

public class Elektronik extends Product {
    private String varumärke;
    private String garanti;

    public Elektronik(int articleNumber, String title, double price, String description, String varumärke, String garanti) {
        super(articleNumber, title, price, description);
        this.varumärke = varumärke;
        this.garanti = garanti;
    }

    @Override
    public String category() {
        return "ELEKTRONIK";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKategori: " + category() +
                "\nVarumärke: " + varumärke +
                "\nGaranti: " + garanti;
    }

}
