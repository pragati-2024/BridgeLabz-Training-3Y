public class Return1 {
    public static void main(String[] args) {
        String str = "Java Programming";

        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("String: " + str);
        System.out.println("Length without length() = " + length);
    }
}
