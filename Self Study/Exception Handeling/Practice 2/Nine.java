import java.util.ArrayList;
import java.util.List;

class NoOddNumberException extends Exception {
    public NoOddNumberException(String msg) {
        super(msg);
    }
}

public class Nine {
    public static List<Integer> findOddSquares(List<Integer> numbers) throws NoOddNumberException {
        List<Integer> odd = new ArrayList<>();

        for (int i : numbers) if (i % 2 != 0) odd.add(i * i);

        if (odd.isEmpty()) throw new NoOddNumberException("No Odd Number Found");

        return odd;
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(2, 4, 6);

        try {
            System.out.println(findOddSquares(numbers1));
        } catch (NoOddNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(findOddSquares(numbers2));
        } catch (NoOddNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
