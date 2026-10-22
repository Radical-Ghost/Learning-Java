// Question 1: Find the Second Largest Element in a List Write a method findSecondLargest that takes a List<Integer> and returns the second largest element in the list. Handle cases where the list has fewer than two elements by returning an appropriate message.

// Sample Input 1:

// findSecondLargest([10, 20, 30, 40, 50])
// Output: 40

// Sample Input 2:

// findSecondLargest([5])
// Output: "Error: List has fewer than two elements"

import java.util.List;
import java.util.ArrayList;

class FewEelementsException extends Exception {
    public FewEelementsException (String msg) {
        super (msg);
    }
}

public class Problem_01 {
    public static Integer findSecondLargest(List<Integer> arr) throws FewEelementsException {
        int fir = 0;
        int sec = 0;

        if (arr.size() < 2) throw new FewEelementsException("Error: List has fewer than two elements");

        for (int i : arr) {
            if (i > fir) {
                sec = fir;
                fir = i;
            }
        }

        return sec;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        List<Integer> arr1 = List.of(3);

        try {
            System.out.println(findSecondLargest(arr));
        } catch (FewEelementsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(findSecondLargest(arr1));
        } catch (FewEelementsException e) {
            System.out.println(e.getMessage());
        }
    }
}
