import java.util.Scanner;

public class XorCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String text = sc.nextLine();
        int xorKey = 0; // Key for XOR operation
        StringBuilder result = new StringBuilder();

        // XOR each character in the text
        for (char ch : text.toCharArray()) {
            char output = (char) (ch ^ xorKey); // XOR operation
            result.append(output);
        }

        // Display original text and XOR result
        System.out.println("Original String: " + text);
        System.out.println("XOR Result: " + result.toString());
    }
}
