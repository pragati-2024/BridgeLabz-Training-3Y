public class ShortestLongest {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Sentence : " + sentence);
        System.out.println("Shortest word : " + shortest);
        System.out.println("Longest word  : " + longest);
    }
}
