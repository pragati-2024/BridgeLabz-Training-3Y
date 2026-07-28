public class SpliText {
    public static void main(String[] args) {
        String text = "Java makes programming easier";

        // Manual split (by space)
        System.out.println("Manual Split:");
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                System.out.println(text.substring(start, i));
                start = i + 1;
            }
        }
        System.out.println(text.substring(start)); // last word

        // Using split()
        System.out.println("\nUsing split() method:");
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
