package project1;
import java.util.Scanner;


public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        
        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Sum the digits of an integer");
        System.out.println("3. Convert a string to uppercase and reverse it");
        System.out.println("4. Exit");
        System.out.print("Input? ");

        // Read user choice
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        //FINISH THE CODE IN MAIN
        if (choice == 1) {
            System.out.print("Enter a string: ");
            String choiceOne = scanner.nextLine();

            boolean isPalindrome = true;
            int start = 0;
            int end = choiceOne.length() - 1;

            while (start < end) {
                if (choiceOne.charAt(start) != choiceOne.charAt(end)) {
                    isPalindrome = false;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                System.out.println(choiceOne + " is a palindrome.");
            } else {
                System.out.println(choiceOne + " is not a palindrome.");
            }

        } else if (choice == 2) {
            System.out.print("Enter an integer: ");
            int choiceTwo = scanner.nextInt();

            int lastDigit = choiceTwo % 10;
            int secondLastDigit = (choiceTwo / 10) % 10;

            int sum = lastDigit + secondLastDigit;
            System.out.println("The sum of the digits is: " + sum);

        } else if (choice == 3) {
            System.out.print("Enter a string: ");
            String choiceThree = scanner.nextLine();

            String upperCaseString = "";
            for (int i = 0; i < choiceThree.length(); i++) {
                char ch = choiceThree.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    upperCaseString += (char)(ch - 32);
                } else {
                    upperCaseString += ch;
                }
            }

            String reversedString = reverseString(upperCaseString);

            System.out.println("Uppercase: " + upperCaseString);
            System.out.println("Reversed: " + reversedString);

        } else if (choice == 4) {
            System.out.println("Exiting program. Have a great day!");

        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Method to manually reverse a string
    // You can call it like this:  String str = reverseString("hi") to get ih in str
    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
