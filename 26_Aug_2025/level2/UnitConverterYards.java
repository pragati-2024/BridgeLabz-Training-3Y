public class UnitConverterYards {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        System.out.println("2 Yards in Feet: " + convertYardsToFeet(2));
        System.out.println("6 Feet in Yards: " + convertFeetToYards(6));
        System.out.println("1 Meter in Inches: " + convertMetersToInches(1));
        System.out.println("10 Inches in Meters: " + convertInchesToMeters(10));
        System.out.println("5 Inches in Cm: " + convertInchesToCm(5));
    }
}
