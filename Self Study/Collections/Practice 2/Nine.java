// 4. Game of Collecting caps
// Suppose there are N number if caps in a list of different numbers.
// A person has to decide to pick caps of any one number in such a way that he has the maximum numbers of that cap.

// Sample Input:
// 6
// 2 3 3 2 4 3

// Sample Output:
// 3

// Explanation:
// 2 Number cap count = 2
// 3 Number cap count = 3
// 4 Number cap count = 1

// So, the answer is 3 as it has more number of caps.

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCap = 0;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int discriminant = sc.nextInt();
            map.put(discriminant, map.getOrDefault(discriminant, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (maxCap < map.get(i)) maxCap = map.get(i);
        }

        System.out.println(maxCap);
    }
}
