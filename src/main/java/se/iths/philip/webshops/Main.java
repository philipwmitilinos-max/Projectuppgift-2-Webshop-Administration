package se.iths.philip.webshops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            while (true) {
                System.out.println("Meny");
                System.out.println("1. Lägg till produkt.");
                System.out.println("2. Lista alla produkter.");
                System.out.println("3. Visa alla produkter");
                System.out.println("4. Avsluta");
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Vilken typ av produkt vill du lägga till?");
                        System.out.println("Böcker, Elektronik, Kläder.");
                        break;
                    case 2:
                        System.out.println("Lista alla produkter.");
                        break;
                    case 3:
                        System.out.println("Visa alla produkter.");
                        break;
                    case 4:
                        System.out.println("Avslutar applikationen");
                        return;
                    default:
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Fel: input.");
        }
    }
}
