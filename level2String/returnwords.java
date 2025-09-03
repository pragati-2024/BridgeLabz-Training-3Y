public class ReturnWords {
    // Method that returns word count
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+"); // split by spaces
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is an object oriented programming language";

        int count = countWords(str);

        System.out.println("Sentence: " + str);
        System.out.println("Word Count: " + count);
    }
}
