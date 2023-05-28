package febBatch.FunctionlInterfaces;

import decBatch.stremas.Customers;
import decBatch.stremas.Students;
import febBatch.StaticData;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Function {

    public static void main(String[] args) {


        Integer studentById = getStudentById(getStudents());
        Integer integer = addTwo(studentById);
//        System.out.println(integer);

        //        invoking functional interface
        func1.apply(getStudents());

        //        invoking functional interface and method chaining example
        Integer apply = func1.andThen(addTwoToFunc1)
                .andThen(_Function::addTwo)
                .andThen(_Function::addTwo)
                .apply(getStudents());

//        System.out.println(apply);

        //invoking BIFunctional interface
        Integer apply2 = addTwoToBiFunc1.apply(10, 12);
//        System.out.println(apply2);

        //invoking BIFunctional interface with method chaining
        Integer apply1 = addTwoToBiFunc1
                .andThen(_Function::addTwo)
                .apply(10, 10);
//        System.out.println(apply1);

    }


    static Function<List<Students>, Integer> func1 = val -> {
        for (Students s : val) {
            if (s.getStuId() == 123) {
                return Math.toIntExact(s.getStuId());
            }
        }
        return 1;
    };

    static Function<Integer, Integer> addTwoToFunc1 = val -> {
        return val + 2;
    };

    static BiFunction<Integer, Integer, Integer> addTwoToBiFunc1 = (val1, val2) -> {
        return val1 + val2;
    };


    static Integer getStudentById(List<Students> val) {
        for (Students s : val) {
            if (s.getStuId() == 123) {
                return Math.toIntExact(s.getStuId());
            }
        }
        return 1;
    }

    static Integer addTwo(int val) {
        return val + 2;
    }


    private static List<Customers> getCustomers() {
        StaticData staticData = new StaticData();
        return staticData.customersData();
    }

    private static List<Students> getStudents() {
        StaticData staticData = new StaticData();
        return staticData.studentsData();
    }
}
