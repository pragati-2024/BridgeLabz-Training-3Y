// File: ChillTemprature.java
public class ChillTemprature {

    // Method to calculate wind chill
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        ChillTemprature chill = new ChillTemprature();

        double temperature = 30.0; // Fahrenheit
        double windSpeed = 10.0;   // mph

        double windChill = chill.calculateWindChill(temperature, windSpeed);

        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Wind Speed: " + windSpeed + " mph");
        System.out.println("Calculated Wind Chill: " + windChill + "°F");
    }
}
