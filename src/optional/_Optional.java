package optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class _Optional {

    public static void main(String[] args) {
        Optional<Integer> i = Optional.ofNullable(954654511);

//        throw exception if value is not present
//        Integer value_is_null = i.orElseThrow();

//        throw our custom exception if value is not present
//        Integer value_is_null = i.orElseThrow(() -> new IllegalArgumentException("value is null"));

//        set a default value if value is not present
//        Integer value_is_null = i.orElse(41562);

//        setting a default value on some condition(as per requirement) if value is not present
//        Integer value_is_null = i.orElseGet(() ->
//                IntStream.rangeClosed(1, 100).filter(value -> value - value == 0).findFirst().getAsInt()
//        );

//        to get the value
//        Integer value_is_null = i.get();
//        System.out.println(value_is_null);

//        checks whether value is present or not if present prints true
//        i.ifPresent(integer -> System.out.println(integer));
//        System.out.println(i.isPresent());

//        checks whether value is empty or not if empty prints true
//        System.out.println(i.isEmpty());

//        checks whether value is present if not add some logic with the help of runnable interface
        i.ifPresentOrElse(x -> System.out.println(x), () -> System.out.println(100));

//        checks whether is present or not if present ".get()" method gets the value
//        if(i.isPresent()) System.out.println(i.get());
//        else System.out.println("not there");
    }
}
