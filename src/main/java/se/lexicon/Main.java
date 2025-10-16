package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    //Fixed conversion rates//
    final static double SEK_TO_USD = 0.11;
    final static double USD_TO_SEK = 9.48;
    final static double SEK_TO_EURO = 0.091;
    final static double EURO_TO_SEK = 11.05;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("-------------Currency Converter App-------------");
        System.out.println("Choose by picking the number, ex: 1 = SEK to USD");

        String [] menuOptions = {
                "1. SEK to USD",
                "2. USD to SEK",
                "3. EURO to SEK",
                "4. SEK to EURO",
                "5. Close"
        };

        while (true) {

            for (String menuOption : menuOptions) {
                System.out.println(menuOption);
            }
            System.out.print("Choose conversion or '5/exit' to close: ");

            String choice = userInput.nextLine();
            if (choice.equals("5") || choice.equalsIgnoreCase("exit")) {
                System.out.println("Closing program... ");
                break;
            }

            if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"))  {
                System.out.println("Invalid input");
                continue;
            }

            double amount;
            System.out.print("Enter the amount to be converted: ");
            if (userInput.hasNextDouble()) {
                amount = userInput.nextDouble();
                userInput.nextLine();

                if (amount < 0) {
                    System.out.println("Invalid input. Amount cannot be negative");
                    continue;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                userInput.nextLine();
                continue;
            }

        double result;
            switch (choice) {
                case "1":
                    result = convertSEKToUSD(amount);
                    dateTimePrinter(amount + " SEK = " + result + " USD");
                    break;
                case "2":
                    result = convertUSDToSEK(amount);
                    dateTimePrinter(amount + " USD = " + result + " SEK");
                    break;
                case "3":
                    result = convertSEKToEuro(amount);
                    dateTimePrinter(amount + " SEK = " + result + " Euro");
                    break;
                case "4":
                    result = convertEuroToSEK(amount);
                    dateTimePrinter(amount + " Euro = " + result + " SEK");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
        userInput.close();
    }

    public static double convertSEKToUSD(double amount) { return amount * SEK_TO_USD; }
    public static double convertUSDToSEK(double amount) { return amount * USD_TO_SEK; }
    public static double convertSEKToEuro(double amount) { return amount * SEK_TO_EURO; }
    public static double convertEuroToSEK(double amount) {  return amount * EURO_TO_SEK; }

    //adds time to the switch lines//
    public static void dateTimePrinter(String message) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(message + " Time: " +  formattedDateTime);
    }
}