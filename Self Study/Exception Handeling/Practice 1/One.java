public class One {
    public static Object getStringLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            return "Error: Null value passed";
        }
    }

    public static void main(String[] args) {
        System.out.println(getStringLength("Hello"));
        System.out.println(getStringLength(null));
    }
}
