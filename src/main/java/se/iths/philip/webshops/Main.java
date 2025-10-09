package se.iths.philip.webshops;

import se.iths.philip.webshops.model.Bok;
import se.iths.philip.webshops.model.Clothes;
import se.iths.philip.webshops.model.Elektronik;
import se.iths.philip.webshops.model.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    public static void main(String[] args) {
        productList = new ArrayList<>();

        Bok listBok = new Bok(101, "Antekning",
                49, "En anteknings bok.", "Bouyner AB", 55);
        productList.add(listBok);
        Elektronik listElektronik = new Elektronik(201, "Cat5e STP Kabel 10m",
                599, "Kategori 5 express Shielded Twisted Pair kabel 10 meter.",
                "IEEE", "6 månader.");
        productList.add(listElektronik);
        Clothes listClothes = new Clothes(301, "Tröja",
                79, "Bomuls tröja.", "XL", "Vit");
        productList.add(listClothes);

        try {
            while (true) {
                System.out.println("Meny");
                System.out.println("1. Lägg till produkt.");
                System.out.println("2. Lista alla produkter.");
                System.out.println("3. Visa en produkt");
                System.out.println("4. Avsluta");
                System.out.print("Val: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                switch (input) {
                    case 1 -> addProduct();
                    case 2 -> showProductList();
                    case 3 -> findProduct();
                    case 4 -> {
                        System.out.println("Avslutar applikationen");
                        return;
                    }
                    default -> System.out.println("Fel val.");
                }
                
            }
        } catch (InputMismatchException e) {
            System.err.println("Fel: input.");
        }
    }

    public static void addProduct() {
        try {
            System.out.println("Vilken typ av produkt vill du lägga till?");
            System.out.println("1. Böcker");
            System.out.println("2. Elektronik");
            System.out.println("3. Clothes");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1 -> addBok();
                case 2 -> addElektronik();
                case 3 -> addClothes();
                default -> System.out.println("Fel val.");
            }

        } catch (InputMismatchException e) {
            System.err.println("Fel: input.");
        }
    }

    public static void addBok() {
        try {
            System.out.println("Ge artikelnummer");
            int articleNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ge title");
            String title = scanner.nextLine();
            System.out.println("Set prise");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ge Beskrivning");
            String description = scanner.nextLine();
            System.out.println("Ge författare");
            String auther = scanner.nextLine();
            System.out.println("Ge sidor");
            int sidor = scanner.nextInt();
            scanner.nextLine();
            Bok bok = new Bok(articleNumber,
                    title, price, description, auther, sidor);
            productList.add(bok);
        } catch (Exception e) {
            System.err.println("Något fel har hänt!");
        }
    }

    public static void addElektronik() {
        try {
            System.out.println("Ge artikelnummer");
            int articleNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ge title");
            String title = scanner.nextLine();
            System.out.println("Set prise");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ge Beskrivning");
            String description = scanner.nextLine();
            System.out.println("Ge varumärke");
            String varumärke = scanner.nextLine();
            System.out.println("Ge garanti längd");
            String garanti = scanner.nextLine();
            Elektronik elektronik = new Elektronik(articleNumber,
                    title, price, description, varumärke, garanti);
            productList.add(elektronik);
        } catch (Exception e) {
            System.err.println("Något fel har hänt!");
        }
    }

    public static void addClothes() {
        try {
            System.out.println("Ge artikelnummer");
            int articleNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ge title");
            String title = scanner.nextLine();
            System.out.println("Set prise");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ge Beskrivning");
            String description = scanner.nextLine();
            System.out.println("Set storlek");
            String size = scanner.nextLine();
            System.out.println("Ge färg");
            String color = scanner.nextLine();
            Clothes clothes = new Clothes(articleNumber,
                    title,
                    price,
                    description,
                    size,
                    color);
            productList.add(clothes);
        } catch (Exception e) {
            System.err.println("Något fel har hänt!");
        }
    }

    public static void showProductList() {
        System.out.println("Antal produkter: " + productList.size());
        for (Product product : productList) {
            System.out.println("-------------------------------------------------------");
            System.out.println(product);
            System.out.println();
        }
    }

    public static void findProduct() {
        try {
            System.out.println("Ange artikelnummer:");
            int searchInput = scanner.nextInt();
            scanner.nextLine();
            boolean found = false;
            for (Product product : productList) {
                if (product.getArticleNumber() == searchInput) {
                    System.out.println("***********************************************************");
                    System.out.println(product);
                    System.out.println();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Hittar inte artikelnummer: " + searchInput);
            }
        } catch (InputMismatchException e) {
            System.err.println("Något fel har hänt!");
        }
    }
}
