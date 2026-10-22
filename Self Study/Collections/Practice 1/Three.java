import java.util.LinkedHashMap;
import java.util.List;

public class Three {
    public static LinkedHashMap<String, Integer> countFrequency (List<String> words) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : words) map.put(s, map.getOrDefault(s, 0) + 1);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(countFrequency(List.of("cat", "dog", "cat", "dog", "cat")));
        System.out.println(countFrequency(List.of("apple", "banana", "apple", "orange", "banana", "apple")));
    }
}
