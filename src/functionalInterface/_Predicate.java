package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

//        invoking Predicate Interface
        boolean test = isEven.test(10);
        System.out.println(String.format("test:  %s", test));
        boolean res = isValid.test("ahgda");
        System.out.println(String.format("test:  %s", res));

        System.out.println(isConatinsValidData.test("axa", 50));

//        invoking Predicate Interface and method chaining example
        boolean test1 = isEven1.and(isEven).test(100);
        System.out.println(String.format("test1:  %s", test1));

//        invoking BiPredicate Interface and method chaining example
        boolean axa = isConatinsValidData.and(isConatinsValidData1).test("aa", 100);
        System.out.println(axa);
    }


    static Predicate<Integer> isEven = (val) -> val % 2 == 0;
    static Predicate<Integer> isEven1 = (val) -> val == 101;
    static Predicate<String> isValid = (val) ->
            val.startsWith("a") && val.contains("x") && val.endsWith("a");

    static BiPredicate<String, Integer> isConatinsValidData = (val, num) ->
            val.startsWith("a") && val.contains("x") && num >= 0 && num % 2 == 0;

    static BiPredicate<String, Integer> isConatinsValidData1 = (val, num) ->
            val.startsWith("a") && val.endsWith("a") && num >= 0 && num % 2 == 0;


}
