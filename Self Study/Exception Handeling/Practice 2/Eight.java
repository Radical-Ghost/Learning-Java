import java.util.ArrayList;
import java.util.List;

class NoSpecialCharaException extends Exception {
    public NoSpecialCharaException(String msg) {
        super(msg);
    }
}

public class Eight {
    public static List<Character> specialCharacterCounter(String str) throws NoSpecialCharaException {
        List<Character> spl = new ArrayList<>();
        for (char s : str.toCharArray()) {
            if (!Character.isLetterOrDigit(s) && !Character.isWhitespace(s)) spl.add(s);
        }

        if (spl.isEmpty()) {
            throw new NoSpecialCharaException("No Special Character Found");
        }

        return spl;
    }

    public static void main(String[] args) {
        String test1 = "hello@world!";
        String test2 = "helloworld";

        try {
            List<Character> result1 = specialCharacterCounter(test1);
            System.out.println(result1);
        } catch (NoSpecialCharaException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Character> result2 = specialCharacterCounter(test2);
            System.out.println(result2);
        } catch (NoSpecialCharaException e) {
            System.out.println(e.getMessage());
        }

    }
}
