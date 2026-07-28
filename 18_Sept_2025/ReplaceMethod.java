import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        String modified = sentence.replaceAll(oldWord, newWord);
        System.out.println("Modified sentence: " + modified);
    }
}
