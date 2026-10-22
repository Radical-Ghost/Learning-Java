public class Five {
    public static String nestedExceptionHandling(String s1, String s2, int[] arr, int index) {
        boolean divError = false;
        boolean indexError = false;
        String divisionResult = "";
        String elementResult = "";

        try {
            try {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int div = n1 / n2;
                divisionResult = String.valueOf(div);
            } catch (ArithmeticException | NumberFormatException ane) {
                divError = true;
            }

            try {
                elementResult = String.valueOf(arr[index]);
            } catch (ArrayIndexOutOfBoundsException ab) {
                indexError = true;
            }

            if (indexError && divError) return "Error: Division by zero and index out of bounds";
            else if (divError) return "Error: Division by zero";
            else if (indexError) return "Error: Index out of bounds";

            return (divisionResult + " and Element: " + elementResult);

        } catch (Exception e) {
            return "Error: Unexpected Error";
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(nestedExceptionHandling("20", "5", arr, 1));
        System.out.println(nestedExceptionHandling("10", "0", arr, 3));
        System.out.println(nestedExceptionHandling("10", "10", arr, 5));
        System.out.println(nestedExceptionHandling("10", "c", arr, 5));
    }
}
