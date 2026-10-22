// Question 3: Custom Exception for Age Validation Write a method checkAge that takes an integer representing a person's age and throws a custom InvalidAgeException if the age is less than 18. Otherwise, it returns a message saying the person is eligible.

// Sample Input 1 (Valid):

// checkAge(20)
// Output: "Eligible"

// Sample Input 2 (Invalid - age too low):

// checkAge(15)
// Output: "InvalidAgeException: Age must be 18 or above"


class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Three {
    public static String checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above");
        return "Eligible";
    }

    public static void main(String[] args) {
        try {
            System.out.println(checkAge(20));
            System.out.println(checkAge(15));
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
