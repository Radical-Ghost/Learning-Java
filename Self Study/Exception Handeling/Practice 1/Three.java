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
