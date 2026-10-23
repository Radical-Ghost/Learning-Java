// Group Anagrams

// Function Signature: List<List<String>> groupAnagrams(String[] strs)
// Sample Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
// Sample Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]] (Grouped anagrams.)

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;

public class Problem_14 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        for (List<String> group : result) Collections.sort(group);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split("\\s+");

        System.out.println(groupAnagrams(strs));

        sc.close();
    }
}
