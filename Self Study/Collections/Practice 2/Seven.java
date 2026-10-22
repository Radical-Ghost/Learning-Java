// 2. WAP in Java to return the length of the words stored inside in a List as Maps.

// Sample Input:
// 3
// apple
// banana
// cherry

// Sample Output:
// {"apple":5, "banana":6, "cherry":6}

import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int n;
        List<String> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) lst.add(sc.next());

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : lst) map.put(s, map.getOrDefault(s, 0) + 1);

        System.out.println(map);

    }
}
