// 3. Find the intersection of two List and return the result as a List.

// Sample Input:
// 4
// 1 2 3 4
// 4
// 3 4 5 6

// Sample Output:
// [3, 4]

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Problem_08 {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        // lst1.addAll(Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::valueOf).toList()); or do the following
        String discriminant1 = sc.nextLine();
        String[] tokens = discriminant1.split("\\s+");
        for (String token : tokens) lst1.add(Integer.parseInt(token));

        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) lst2.add(sc.nextInt()); //or use this

        List<Integer> result = new ArrayList<>(lst1);
        result.retainAll(lst2);
        System.out.println(result);
    }
}
