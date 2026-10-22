// Question 2: Merge Two Lists Without Duplicates Write a method mergeLists that takes two List<Integer> and returns a new list containing all elements from both lists without any duplicates. Maintain the order of elements from both lists.

// Sample Input 1:

// mergeLists([1, 2, 3], [3, 4, 5])
// Output: [1, 2, 3, 4, 5]

// Sample Input 2:

// mergeLists([10, 20], [30, 40])
// Output: [10, 20, 30, 40]


import java.util.List;
import java.util.ArrayList;

public class Problem_02 {
    public static List<Integer> mergeList(List<Integer> arr, List<Integer> arr1) {
        for (int i : arr1) if (!arr.contains(i)) arr.add(i);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> arr1 = new ArrayList<>(List.of(3, 4, 5));

        System.out.println(mergeList(arr, arr1));
    }
}
