import java.util.Random;

public class RandomValueCheck {

    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000); // random 4 digit
        }

        return arr;
    }

    // Method to find average, min, max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        System.out.print("Generated numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
