// Question 2: Arithmetic and Array Exception Handling Write a method calculateAverage that takes an array of integers and returns the average. Handle exceptions for division by zero (empty array) and array access errors (index out of bounds).

// Sample Input 1 (Valid):

// calculateAverage(arr) // arr[] = {10,20,30}
// Output: 20
// Sample Input 2 (Invalid - empty array):

// calculateAverage(new int[]{})
// Output: "Error: Division by zero"


public class Two {
    public static void calculateAverage(int[] arr) {
        try {
            int sum = 0;
            for (int a : arr) sum += a;
            sum /= arr.length;
            System.out.println(sum);
        } catch (ArithmeticException ar) {
            System.out.println("Error: Division by zero");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        calculateAverage(arr);
        calculateAverage(new int[]{});
    }
}
