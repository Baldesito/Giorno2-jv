package Esercizio4;

import java.util.Scanner;

public class For {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inserisci un numero Intero: ");
    int numero = scanner.nextInt();

    for (int i = numero; i >= 0; i--){
        System.out.println(i);
    }
}
}