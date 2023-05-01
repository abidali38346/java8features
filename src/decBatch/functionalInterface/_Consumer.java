package decBatch.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // invoking consumer interface
        consumerFunc.accept(List.of(1, 2, 3, 4, 5));
        // invoking consumer interface and method chaining example
        consumerFunc.andThen(consumerFunc1).accept(List.of(1, 2, 3, 4, 5));

        // invoking BiConsumer interface
        consumerBiFunc.accept(List.of(1, 2, 3, 4, 5, 5, 5, 2, 10, 3), 3);
        // invoking BiConsumer interface and method chaining example
        consumerBiFunc.andThen(consumerBiFunc1).accept(List.of(1, 2, 3, 4, 5, 5, 5, 2, 10, 3), 3);


    }

    static Consumer<List<Integer>> consumerFunc = (list) -> System.out.println(list);
    static Consumer<List<Integer>> consumerFunc1 = (list) -> System.out.println(2);

    static BiConsumer<List<Integer>, Integer> consumerBiFunc = (list, i) -> {
        for (Integer val : list) {
            if (val == i) {
                System.out.println(val);
            }
        }
    };

    static BiConsumer<List<Integer>, Integer> consumerBiFunc1 = (list, i) -> {
        for (Integer val : list) {
            if (val != i) {
                System.out.println(val);
            }
        }
    };

//    advance way of implementation for consumer Functional Interface
//    static BiConsumer<List<Integer>, Integer> consumerBiFunc = (list, i) ->
//            list.stream().filter(val -> val == i).forEach(System.out::println);
}
