package section2;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        
        int counter = 0;

        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner = new Scanner( System.in );

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;


        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice *foodAmount)+ " on food");

    }
}
