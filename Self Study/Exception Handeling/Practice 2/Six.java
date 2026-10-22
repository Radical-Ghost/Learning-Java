import java.util.ArrayList;
import java.util.List;

public class Six {
    public static void numberSegregator(String text) {
        try {
            List<Integer> numbers = new ArrayList<>();
            int discriminant = 0;
            for (char s : text.toCharArray()) {
                if (Character.isDigit(s)) discriminant = discriminant * 10 + (s - '0');
                else {
                    if (discriminant != 0) {
                        numbers.add(discriminant);
                        discriminant = 0;
                    }
                }
            }
            if (discriminant != 0) numbers.add(discriminant);
            if (numbers.isEmpty()) System.out.println("Invalid Input");
            else System.out.println(numbers);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }


    public static void main(String[] args) {
        String text = "dgarg534htyty6758gh56";
        String text1 = "dgarghtytygh";
        numberSegregator(text);
        numberSegregator(text1);
    }
}
