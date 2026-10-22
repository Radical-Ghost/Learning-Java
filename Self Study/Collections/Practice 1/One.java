import java.util.List;
import java.util.ArrayList;

class FewEelementsException extends Exception {
    public FewEelementsException (String msg) {
        super (msg);
    }
}

public class One {
    public static Integer findSecondLargest(List<Integer> arr) throws FewEelementsException {
        int fir = 0;
        int sec = 0;

        if (arr.size() < 2) throw new FewEelementsException("Error: List has fewer than two elements");

        for (int i : arr) {
            if (i > fir) {
                sec = fir;
                fir = i;
            }
        }

        return sec;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        List<Integer> arr1 = List.of(3);

        try {
            System.out.println(findSecondLargest(arr));
        } catch (FewEelementsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(findSecondLargest(arr1));
        } catch (FewEelementsException e) {
            System.out.println(e.getMessage());
        }
    }
}
