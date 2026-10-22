import java.util.List;
import java.util.ArrayList;

public class Two {
    public static List<Integer> mergeList(List<Integer> arr, List<Integer> arr1) {
        for (int i : arr1) if (!arr.contains(i)) arr.add(i);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> arr1 = new ArrayList<>(List.of(3, 4, 5));

        System.out.println(mergeList(arr, arr1));
    }
}
