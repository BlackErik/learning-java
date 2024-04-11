package section3;

public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("Sunny weather");
                break;
            case "cloudy":
                System.out.println("Cloudy weather");
                break;
            case "rainy":
                System.out.println("Rainy weather");
                break;
            case "snowy":
                System.out.println("Snowy weather");
                break;
            default:
                System.out.println("weather");
                break;
        }

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1:
                System.out.println("Admin");
                break;
            case 2:
                System.out.println("Editor");
                break;
            case 3:
                System.out.println("User");
                break;
            default:
                System.out.println("IDK");
                break;
        }

        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60) {
            System.out.println("too hot and humid");
        } else if (temperature >= 80) {
            System.out.println("Too hot");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid");
        } else if (temperature <= 60) {
            System.out.println("It's too cold");
        } else {
            System.out.println("It's comfortable");
        }

        int age = 25;
        int income = 50000;

        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Slow");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("good luck");
                break;
        }

        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Using chrome");
                break;
            case "Firefox":
                System.out.println("Using Firefox");
                break;
            case "Safari":
                System.out.println("Using Safari");
                break;
            case "Edge":
                System.out.println("Using Edge");
                break;
            default:
                System.out.println("Idk what you're on");
                break;
        }

    }
}
