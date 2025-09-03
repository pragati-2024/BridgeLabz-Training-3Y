import java.util.Scanner;

class FcusingUnique {
    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        return len;
    }

    public static char[] uniqueCharacters(String text) {
        int n = getLength(text);
        char[] temp = new char[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = c;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
