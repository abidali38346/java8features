package febBatch.StaticAndDefault;

import decBatch.stremas.Employee;
import febBatch.StaticData;

import java.util.List;

public class StaticAndDefaultInterfaceImpl implements StaticAndDefaultInterface {

    public static void main(String[] args) {
        // invoking static method
        int add = StaticAndDefaultInterface.add(10, 11);
//        System.out.println(add);


        List<Employee> addEmployee = StaticAndDefaultInterface.addEmployee(new Employee(11, "empName123", 33, "Female",
                "Degree"));
//        System.out.println(addEmployee);

        List<Employee> deleteEmployee = StaticAndDefaultInterface.deleteEmployee(123456);
//        System.out.println(deleteEmployee);

        int isExists = StaticAndDefaultInterface.findEmployeeById(123456);

        StaticData data = new StaticData();
        StaticAndDefaultInterfaceImpl staticAndDefaultInterface = new StaticAndDefaultInterfaceImpl();
//        int employeeByIdByGenerics = staticAndDefaultInterface.findEmployeeByIdByGenerics(12345, data.employeesData());
        int employeeByIdByGenerics = staticAndDefaultInterface.byIdByGenerics(data.studentsData());
//        System.out.println(employeeByIdByGenerics);

        String abc = staticAndDefaultInterface.returnStr("abc");
        System.out.println(abc);
    }

    @Override
    public String returnStr(String s) {
        return s;
    }

    // overriding default method
    @Override
    public int add1(int a, int b) {
        return a * b;
    }
}
