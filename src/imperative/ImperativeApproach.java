package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImperativeApproach {
    public static void main(String[] args) {
//        imperative approach

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        evenNums(ints);

    }

    private static List<Integer> evenNums(List<Integer> ints) {
//        imperative approach
//        List<Integer> out = new ArrayList<>();
//        for (int i : ints) {
//            if (i % 2 == 0) {
//                out.add(i);
//            }
//        }
//        return out;

//        declerative approach
        return ints.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
    }


}
