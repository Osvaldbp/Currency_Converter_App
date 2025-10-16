package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Currency Converter App:");

        String[] convertOptions = {
                "Convert SEK to USD",
                "Convert USD to SEK",
                "Convert SEK to Euro",
                "Convert euro to SEK",
                "Exit"
        };

        for (int i = 0; i < convertOptions.length; i++) {
            System.out.println((i + 1) + ". " + convertOptions[i]);
        }
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();

    }

}