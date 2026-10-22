// 4. Anjali is given a list of integers.
// She needs to implement a method findOddSquares(List<Integer> numbers) that returns a list of squares of all odd integers from the list.
// If no odd number is found, the method should throw a "No Odd Number Found" exception.

// Sample Input 1:
// [1, 2, 3, 4, 5]

// Sample Output 1:
// [1, 9, 25]

// Sample Input 2:
// [2, 4, 6]

// Sample Output 2:
// No Odd Number Found

import java.util.ArrayList;
import java.util.List;

class NoOddNumberException extends Exception {
    public NoOddNumberException(String msg) {
        super(msg);
    }
}

public class Nine {
    public static List<Integer> findOddSquares(List<Integer> numbers) throws NoOddNumberException {
        List<Integer> odd = new ArrayList<>();

        for (int i : numbers) if (i % 2 != 0) odd.add(i * i);

        if (odd.isEmpty()) throw new NoOddNumberException("No Odd Number Found");

        return odd;
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(2, 4, 6);

        try {
            System.out.println(findOddSquares(numbers1));
        } catch (NoOddNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(findOddSquares(numbers2));
        } catch (NoOddNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
