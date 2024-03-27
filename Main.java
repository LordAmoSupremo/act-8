package juegocartas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        System.out.println("Bienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Mezclar deck");
        System.out.println("2. Sacar una carta");
        System.out.println("3. Carta al azar");
        System.out.println("4. Generar una mano de 5 cartas");
        System.out.println("0. Salir");

        int option;
        do {
            System.out.print("Opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}