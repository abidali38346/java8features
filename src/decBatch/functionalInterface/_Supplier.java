package decBatch.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

//        invoking supplier Interface
        Integer s = supplierFunc.get();
        System.out.println(s);

    }

    static Supplier<Integer> supplierFunc = () -> 11;
}
