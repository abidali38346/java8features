package febBatch.StaticAndDefault;

import decBatch.stremas.Customers;
import decBatch.stremas.Employee;
import febBatch.StaticData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface StaticAndDefaultInterface {

    // java 8 introduced static and default methods in interface
    // so that we can handle the multiple inheritance problem

    // static method:-
    // we can add default implementation so that we can force developer not to override the implementation
    // we can invoke static method as normal static method of a class.

    // default method :-
    // it is also same as static method but developer can override the implentation of it whenever it is necessary
    // to invoke the default method we need to implement the interface with the help of that implementation we can invoke the default method.

    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a + b;
    }

    default int add1(int a, int b) {
        return a + b;
    }

    default int mul1(int a, int b) {
        return a + b;
    }

    //realtime test scenarios examples

    // finding whether employee exists in the employee list or not
    // we can make this method as static such that we can use this anywhere as many time as we want
    // we can make this method open to read closed to write such that no can override this
    // so that the call stack frame in the heap of this method call will be once
    // because we are making this method as a reusable one
    static int findEmployeeById(int id) {
        StaticData data = new StaticData();
        List<Employee> employees = data.employeesData();
        for (Employee emp : employees) {
            if (emp.getEmpId() == id) {
                return (int) emp.getEmpId();
            }
        }
        return 0;

        // single liner with the help of lamda expressions and functional interfaces with the help of streams api
//        return employees.stream().filter(e->e.getEmpId() == id).findFirst().get();
    }

    // delete employee
    static List<Employee> deleteEmployee(int id) {
        StaticData data = new StaticData();
        List<Employee> employees = data.employeesData();
        List<Employee> updatedEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getEmpId() != id) {
                updatedEmployees.add(emp);
            }
        }

        return updatedEmployees;

        //need to discuss in imperative manner because we can modify collection while loop it
        // problem can be solved by the cost of extra space -> will discuss in streams topic
        // advantages of streams to overcome above problems
        // will discuss in upcoming classes
        // single liner
//        return employees.stream().filter(e -> e.getEmpId() != id).collect(Collectors.toList());
    }

    // adding a new employee
    static List<Employee> addEmployee(Employee emp) {
        StaticData data = new StaticData();
        List<Employee> employees = data.employeesData();
        ArrayList employees1 = new ArrayList(List.of(employees));

        employees1.add(emp);
        return employees1;
    }


}
