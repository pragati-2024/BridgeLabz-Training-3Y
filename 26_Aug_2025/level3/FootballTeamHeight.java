import java.util.Random;

public class FootballTeamHeight {

    // Method to calculate sum of array elements
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest player
    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest player
    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        // Display heights of all players
        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Shortest Player Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Player Height: " + findMean(heights) + " cm");
    }
}
