package se.lexicon;

import java.util.Scanner;

public class Main {

    //Fixed conversion rates//
    final static double SEK_TO_USD = 0.11;
    final static double USD_TO_SEK = 9.48;
    final static double SEK_TO_EURO = 0.091;
    final static double EURO_TO_SEK = 11.05;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Currency Converter App:");

        while (true) {
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
            System.out.print("Enter your choice: ");
            int choice = userInput.nextInt();

            double result = 0;
            double amount = 0;

            if (choice == 5) {
                System.out.println("Closing program...");
                break;
            }


            System.out.print("Enter your amount: ");
            amount = userInput.nextDouble();


            switch (choice) {
                case 1:
                    result = convertSEKToUSD(amount);
                    System.out.println(amount + " SEK =" + result + " USD");
                    break;
                case 2:
                    result = convertUSDToSEK(amount);
                    System.out.println(amount + " USD =" + result + " SEK");
                    break;
                case 3:
                    result = convertSEKToEuro(amount);
                    System.out.println(amount + " USD =" + result + " SEK");
                    break;
                case 4:
                    result = convertEuroToSEK(amount);
                    System.out.println(amount + " USD =" + result + " SEK");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }

        userInput.close();
    }

    public static double convertSEKToUSD(double amount) {
        return amount * SEK_TO_USD;
    }

    public static double convertUSDToSEK(double amount) {
        return amount * USD_TO_SEK;
    }

    public static double convertSEKToEuro(double amount) {
        return amount * SEK_TO_EURO;
    }

    public static double convertEuroToSEK(double amount) {
        return amount * EURO_TO_SEK;
    }

}