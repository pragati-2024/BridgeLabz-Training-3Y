import java.util.*;

public class Votes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        String[] candidates = new String[n];
        int[] voteCount = new int[n];

        // Input candidate names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate " + (i + 1) + " name: ");
            candidates[i] = sc.next();
        }

        System.out.print("Enter number of votes cast: ");
        int v = sc.nextInt();

        // Voting
        System.out.println("Enter votes (candidate names):");
        for (int i = 0; i < v; i++) {
            String vote = sc.next();
            for (int j = 0; j < n; j++) {
                if (candidates[j].equalsIgnoreCase(vote)) {
                    voteCount[j]++;
                }
            }
        }

        // Find winner
        int maxVotes = voteCount[0];
        String winner = candidates[0];
        for (int i = 1; i < n; i++) {
            if (voteCount[i] > maxVotes) {
                maxVotes = voteCount[i];
                winner = candidates[i];
            }
        }

        System.out.println("\nElection Results:");
        for (int i = 0; i < n; i++) {
            System.out.println(candidates[i] + " -> " + voteCount[i] + " votes");
        }

        System.out.println("Winner: " + winner + " with " + maxVotes + " votes!");

        sc.close();
    }
}
