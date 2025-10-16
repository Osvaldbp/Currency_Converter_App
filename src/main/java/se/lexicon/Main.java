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

        System.out.println("Enter your choice: ");
        double amount = userInput.nextDouble();

        double result = 0;


    }
    public static double convertSEKToUSD(double amount) {
        double rate = 0.11;
        return amount * rate;
    }
    public static double convertUSDToSEK(double amount) {
        double rate = 9.48;
        return amount * rate;
    }
    public static double convertSEKToEuro(double amount) {
        double rate = 0.091;
        return amount * rate;
    }
    public static double convertEuroToSEK(double amount) {
        double rate = 11.05;
        return amount * rate;
    }

}