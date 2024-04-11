package section3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        String option = scan.nextLine();

        switch (option) {
            case "yes":
                System.out.println("\nGreat! In one line" +
                        "\nHow much money do you have in your savings?" +
                        "\nAnd, how much do you owe in credit card debt?");
                int savings = scan.nextInt();
                int ccDebt = scan.nextInt();

                System.out.println("\nHow many years have you worked for?");
                int years = scan.nextInt();

                System.out.println("What is your name?");
                scan.nextLine(); // Avoiding next line trap

                String name = scan.nextLine();
                if (savings >= 10000 && ccDebt < 5000 && years > 2) {
                    System.out.println("Congratulations " + name + " You have been approved!");

                } else {
                    System.out.println("Sorry, you are not eligible for a mortgage.");

                }
                break;

            default:
                System.out.println("\nOK. Have a nice day!");
                break;
        }
        scan.close();
    }
}
