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
