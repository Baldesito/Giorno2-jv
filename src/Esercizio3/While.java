package Esercizio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (\"q\" per uscire): ");
            input = scanner.nextLine();
            if (!input.equals("q")){
                for (int i = 0; i < input.length(); i++) {
                    if (i == input.length() -1) {
                        System.out.print(input.charAt(i));
                    } else {
                        System.out.print(input.charAt(i) + ",");
                    }
                }
            }
            System.out.println();
        } while (!input.equals("q"));
    }
}
