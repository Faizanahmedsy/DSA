public class StringConcact {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += string; // Concatenate the string to the result
        }

        return result; // Return the concatenated string
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(6, "I")); // Output: "IIIIII"
        System.out.println(repeatStr(5, "Hello")); // Output: "HelloHelloHelloHelloHello"
    }

}
