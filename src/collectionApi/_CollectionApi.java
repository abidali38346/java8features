package collectionApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _CollectionApi {

    public static void main(String[] args) {
        List<String> names = List.of("Abid", "Hamid", "Mujeed", "abdul", "suhail");

//        eager impletation
//        ArrayList<String> out = new ArrayList<>();
        for (String s : names) {
            if (filterData(s)) {
                printData(s);
            }
        }
//
//        for (String s : out) {
//            System.out.println(s);
//        }


        System.out.println("-----------------------------");

//        lazy implementation


//        way1
//        List.of("Abid", "Hamid", "Mujeed", "abdul", "suhail")
//                .stream()
//                .filter(s -> s.toLowerCase().startsWith("a"))
//                .forEach(System.out::println);

//      way2 (little bit advance level)
        List<String> collect =
                List.of("Abid", "Hamid", "Mujeed", "abdul", "suhail")
                        .stream()
                        .filter(_CollectionApi::filterData)
                        .collect(Collectors.toList());
//                .forEach(_CollectionApi::printData);
    }

    private static Boolean filterData(String s) {
        System.out.println("filter   " + s);
        if (s.toLowerCase().startsWith("a")) return true;
        return false;
    }

    private static void printData(String s) {
        System.out.println("print   " + s);
    }


}
