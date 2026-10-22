// Question 5: Find the Intersection of Two Sets Write a method findSetIntersection that takes two Set<Integer> and returns a new set containing the intersection of the two sets.

// Sample Input 1:

// findSetIntersection(Set.of(1, 2, 3, 4), Set.of(3, 4, 5, 6))
// Output: [3, 4]

// Sample Input 2:

// findSetIntersection(Set.of(10, 20, 30), Set.of(40, 50, 60))
// Output: []

import java.util.HashSet;
import java.util.Set;

public class Problem_05 {
    public static Set<Integer> findSetIntersection (Set<Integer> s1, Set<Integer> s2) {
        // Set<Integer> intersection = new HashSet<>(s1);
        // intersection.retainAll(s2);
        // return intersection;

        Set<Integer> intersection = new HashSet<>();
        for (int x : s2) if (s1.contains(x)) intersection.add(x);
        return intersection;
    }

    public static void main(String[] args) {
        System.out.println(findSetIntersection(Set.of(10, 20, 30), Set.of(30, 50, 60)));
    }
}
