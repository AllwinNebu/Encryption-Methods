package DES_;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class Des_algo {

    private static final String ALGORITHM = "DES/ECB/PKCS5Padding";

    public static String encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes, "UTF-8");
    }

    public static SecretKey generateKey(String keyString) {
        if (keyString.length() != 8) {
            throw new IllegalArgumentException("Key must be exactly 8 characters long.");
        }
        return new SecretKeySpec(keyString.getBytes(), "DES");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter DES key (8 characters): ");
            String keyString = scanner.nextLine();
            SecretKey key = generateKey(keyString);

            System.out.print("Enter plaintext to encrypt: ");
            String plaintext = scanner.nextLine();

            String encryptedText = encrypt(plaintext, key);
            String decryptedText = decrypt(encryptedText, key);

            System.out.println("Encrypted: " + encryptedText);
            System.out.println("Decrypted: " + decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
