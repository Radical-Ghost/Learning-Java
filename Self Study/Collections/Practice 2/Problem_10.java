// 5. Eve runs a small fruit market. She recently received a shipment of fruits consisting of N fruits where some types may appear multiple times. Each type of fruit is assigned a unique number (which can be positive or negative).

// Write a program to determine how many distinct types of fruits she received, the count of each fruit type (in descending order of their unique number), and the ratio of the total number of fruits to the number of distinct types, rounded to the nearest integer.

// Input:

// The first line contains an integer N, the total number of fruits in the shipment.
// The second line contains N integers representing the unique numbers assigned to the fruits.

// Output:

// The first line should contain the number of distinct fruit types.
// The following lines should display the frequency of each fruit type, in descending order of their unique numbers.
// The last line should display the ratio of the total fruits to the number of distinct fruit types, rounded to the nearest integer.

// Sample Input:
// 7
// 4 -3 4 0 -3 5 0

// Sample Output:
// 4
// 2
// 2
// 2
// 1
// 2

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Scanner;

public class Problem_10 {
    public static void printResult(int unique, List<Integer> freq, int n) {
        System.out.println(unique);
        Collections.sort(freq, Collections.reverseOrder());
        for (int i : freq) System.out.println(i);
        System.out.println((int) Math.round((double) n / unique));
    }

    public static void shipment(int n, List<Integer> items) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i : items) map.put(i, map.getOrDefault(i, 0) + 1);

        List<Integer> values = new ArrayList<>(map.values());

        printResult(map.keySet().size(), values, n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < n; i++) items.add(sc.nextInt());

        shipment(n, items);
    }
}
