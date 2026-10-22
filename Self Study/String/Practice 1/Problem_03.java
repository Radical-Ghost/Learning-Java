// Question 3: String Rotation Checker. For example, "waterbottle" is a rotation of "erbottlewat".

// Sample Input 1 (Valid):

// waterbottle
// erbottlewat

// Output:

// True

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        String rot = sc.next();
        sc.nextLine();

        String duo = str + str;
        System.out.println(duo.contains(rot));
    }
}
