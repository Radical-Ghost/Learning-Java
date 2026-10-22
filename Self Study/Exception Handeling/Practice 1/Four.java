// Question 4: Input Validation and Exception Handling Write a method parseAndMultiply that takes a string input, converts it to an integer, and multiplies it by a constant (e.g., 10). Handle exceptions for invalid inputs (e.g., non-numeric values) and return an appropriate error message.

// Sample Input 1 (Valid):

// parseAndMultiply("5") // For String to Integer Conversion use Integer.parseInt(string_value);
// Output: 50
// Sample Input 2 (Invalid - invalid number):

// parseAndMultiply("abc")
// Output: "Error: Invalid input"

public class Four {
    public static void parseAndMultiply(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException ne) {
            System.out.println("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        parseAndMultiply("5");
        parseAndMultiply("x");
    }
}
