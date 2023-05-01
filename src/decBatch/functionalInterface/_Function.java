package decBatch.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        isEven(4);

//        invoking functional interface
        Integer apply = addTenFunctional.apply(12);
        System.out.println(apply);

//        invoking functional interface and method chaining example
        Function<Integer, Integer> res = addTenFunctional
                .andThen(addTenAndMultiplyByTwoFunctional);

        Integer apply1 = res.apply(10);
        System.out.println(apply1);

        //invoking BIFunctional interface
        Integer apply2 = isevenBiFunctional.apply(50, 100);
        System.out.println(apply2);


//        invoking BIFunctional interface and method chaining example
        BiFunction<Integer, Integer, Integer> apply3 = isevenBiFunctional
                .andThen((integer) -> isevenAndMultiplyBiFunctional)
                .apply(12, 12);

        System.out.println(apply3.apply(10, 12));


    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

    static Function<Integer, Integer> addTenFunctional = val -> val + 10;
    static Function<Integer, Integer> addTenAndMultiplyByTwoFunctional = val -> val * 2;

    static BiFunction<Integer, Integer, Integer> isevenBiFunctional = (val, val1) -> val + val1;
    static BiFunction<Integer, Integer, Integer> isevenAndMultiplyBiFunctional = (val, val1) -> (val * val1) + 100;
}
