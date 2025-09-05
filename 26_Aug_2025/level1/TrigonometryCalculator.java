public class TrigonometryCalculator {

    // Method to calculate trigonometric values
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results in array: [sine, cosine, tangent]
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        TrigonometryCalculator calc = new TrigonometryCalculator();

        double angle = 45; // Example angle in degrees
        double[] results = calc.calculateTrigonometricFunctions(angle);

        System.out.println("Angle (Degrees): " + angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
