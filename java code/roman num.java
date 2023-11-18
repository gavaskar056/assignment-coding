import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");

        // Read input Roman numeral as a string
        String str = sc.next();
        int len = str.length();

        // Add a space at the end to handle the last character in the loop
        str = str + " ";
        int result = 0;

        // Iterate through the input Roman numeral characters
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            char next_char = str.charAt(i + 1);

            // Check each Roman numeral character and its corresponding value
            if (ch == 'M') {
                result += 1000;
            } else if (ch == 'C') {
                if (next_char == 'M') {
                    // If CM, add 900 and skip the next character
                    result += 900;
                    i++;
                } else if (next_char == 'D') {
                    // If CD, add 400 and skip the next character
                    result += 400;
                    i++;
                } else {
                    // Else, add 100
                    result += 100;
                }
            } else if (ch == 'D') {
                // If D, add 500
                result += 500;
            } else if (ch == 'X') {
                if (next_char == 'C') {
                    // If XC, add 90 and skip the next character
                    result += 90;
                    i++;
                } else if (next_char == 'L') {
                    // If XL, add 40 and skip the next character
                    result += 40;
                    i++;
                } else {
                    // Else, add 10
                    result += 10;
                }
            } else if (ch == 'L') {
                // If L, add 50
                result += 50;
            } else if (ch == 'I') {
                if (next_char == 'X') {
                    // If IX, add 9 and skip the next character
                    result += 9;
                    i++;
                } else if (next_char == 'V') {
                    // If IV, add 4 and skip the next character
                    result += 4;
                    i++;
                } else {
                    // Else, add 1
                    result++;
                }
            } else {
                // If V, add 5
                result += 5;
            }
        }
        // Print the equivalent integer
        System.out.println("Equivalent Integer: " + result);
    }
}
