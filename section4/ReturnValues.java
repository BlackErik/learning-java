package section4;

public class ReturnValues {
    public static void main(String[] args) {

        double area = calculateArea(2.3, 3.5);

        calculateArea(-5, 2.3);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");

        System.out.println("Area: " + area);

    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals lengh * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho ";
            default:
                return "Language not available";
        }
    }
}
