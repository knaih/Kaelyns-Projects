package project1;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:     ");
        String word = scanner.nextLine();

        System.out.println("Original string:     " + word);

        String trimmedString = word.trim();
        System.out.println("Trimmed string: " + trimmedString);

        String upperCaseString = trimmedString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        String lowerCaseString = trimmedString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        int length = trimmedString.length();
        System.out.println("Length: " + length);

        String replacedString = trimmedString.replace('a', 'o');
        System.out.println("Replaced 'a' with 'o': " + replacedString);

        if (length > 2) {
            String substring = trimmedString.substring(1, length - 1);
            System.out.println("Substring (excluding first and last character): " + substring);
        } else {
            System.out.println("Substring (excluding first and last character): " + trimmedString);
        }

        scanner.close(); // Close the scanner
    }
}
