import java.util.Scanner;

public class SubstituionCipher {

    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Process uppercase letters
            if (Character.isUpperCase(ch)) {
                char shifted = (char) ('A' + (ch - 'A' + shift) % 26);
                result.append(shifted);
            }
            // Process lowercase letters
            else if (Character.isLowerCase(ch)) {
                char shifted = (char) ('a' + (ch - 'a' + shift) % 26);
                result.append(shifted);
            }
            // Ignore spaces and append other non-alphabet characters as is
            else if (ch != ' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the text to encrypt
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Input the shift key
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        // Encrypt the input text
        String encryptedText = caesarCipher(input, key);
        System.out.println("Encrypted: " + encryptedText);

        // Decrypt the encrypted text
        String decryptedText = caesarCipher(encryptedText, -key);
        System.out.println("Decrypted: " + decryptedText);

        scanner.close();
    }
}
