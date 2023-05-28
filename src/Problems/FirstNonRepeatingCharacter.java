package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abidali";

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char s : chars) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> s : entries) {
            if (s.getValue() == 1) {
                System.out.println(s.getKey());
                break;
            }
        }

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Map.Entry<String, Long> firstNonReeatingCharacter = collect.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get();

        System.out.println(firstNonReeatingCharacter.getKey());


        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .stream().forEach(e -> System.out.println(e.getKey()));

    }
}
