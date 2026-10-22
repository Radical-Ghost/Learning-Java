// Question 5: Replace Substring

// Sample Input 1 (Valid):

// banana
// na
// xy

// Output:
// baxyxy

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String x = sc.nextLine();
        String y = sc.nextLine();

        str = str.replaceAll(x, y);

        System.out.println(str);
    }
}
