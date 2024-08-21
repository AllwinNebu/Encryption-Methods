package experiment2;

import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {
        // Create a Scanner object to receive user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the message
        System.out.print("Enter a message: ");
        String original = scanner.nextLine(); // Read the user input

        // StringBuilder objects to hold the results of AND, OR, and XOR operations
        StringBuilder andResult = new StringBuilder();
        StringBuilder orResult = new StringBuilder();
        StringBuilder xorResult = new StringBuilder();

        // Perform bitwise operations on each character
        for (char ch : original.toCharArray()) {
            // Print the original character and its ASCII value
            System.out.print(ch + ":");
            int charValue = (int) ch;
            System.out.print(charValue + ":");

            // Perform AND operation with 127 and cast to char
            int andChar = charValue & 127;
            System.out.print(andChar + ":");
            char andResultChar = (char) andChar;

            // Perform OR operation with 127 and cast to char
            int orChar = charValue | 127;
            System.out.print(orChar + ":");
            char orResultChar = (char) orChar;

            // Perform XOR operation with 127 and cast to char
            int xorChar = charValue ^ 127;
            System.out.print(xorChar);
            char xorResultChar = (char) xorChar;

            // Append the results to respective StringBuilders
            andResult.append(andResultChar);
            orResult.append(orResultChar);
            xorResult.append(xorResultChar);

            // Print a new line for better readability
            System.out.println();
        }

        // Print the results
        System.out.println("\nOriginal String: " + original);
        System.out.println("AND with 127: " + andResult.toString());
        System.out.println("OR with 127: " + orResult.toString());
        System.out.println("XOR with 127: " + xorResult
