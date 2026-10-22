// 5. Vikram is given a list of integers.
// He needs to implement a method findPrimeCubes(List<Integer> numbers) that returns a list of cubes of all prime numbers from the list.
// If no prime number is found, the method should throw a "No Prime Number Found" exception.

// Sample Input 1:
// [2, 3, 4, 5, 6]

// Sample Output 1:
// [8, 27, 125]

// Sample Input 2:
// [4, 6, 8, 9]

// Sample Output 2:
// No Prime Number Found

import java.util.ArrayList;
import java.util.List;

class NoPrimeNumberException extends Exception {
    public NoPrimeNumberException (String msg) {
        super(msg);
    }
}

public class Problem_10 {
    public static boolean isPrime (int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;

        return true;
    }

    public static List<Integer> findPrimeCubes(List<Integer> nums) throws NoPrimeNumberException {
        List<Integer> cubes = new ArrayList<>();

        for (int i : nums) if (isPrime(i)) cubes.add(i * i * i);

        if (cubes.isEmpty()) throw new NoPrimeNumberException("No Prime Number Found");

        return cubes;
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(0, 1, 4, 6);

        try {
            System.out.println(findPrimeCubes(numbers1));
        } catch (NoPrimeNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(findPrimeCubes(numbers2));
        } catch (NoPrimeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
