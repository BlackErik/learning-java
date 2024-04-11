package section3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String option1 = scan.nextLine();
        if (option1.equals("c")) {
            score += 5;
        }

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String option2 = scan.nextLine();
        if (option2.equals("a")) {
            score += 5;
        }

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String option3 = scan.nextLine();
        if (option3.equals("d")) {
            score += 5;
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String option4 = scan.nextLine();
        if (option4.equals("a") || option4.equals("b")) {
            score += 5;
        }

        System.out.println("Your final score is: " + score + "/20");

        if (score >= 15) {
            System.out.println("wow, you know your stuff!");
        } else if (score >= 5 && score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time");
        }

        scan.close();

    }
}
