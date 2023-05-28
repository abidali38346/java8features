package febBatch;

import decBatch.stremas.Customers;
import decBatch.stremas.Students;
import febBatch.StaticData;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataClassOne {


    public static void main(String[] args) {
        List<Customers> customers = getCustomers();
        List<Students> students = getStudents();

    }


    private static Students getStudentById(int id) {
        List<Students> students = getStudents();


        for (Students s : students) {
            if (s.getStuId() == id) {
                int stuMarks = s.getStuMarks();
                if (stuMarks > 10) {
                    return s;
                }
            }
        }
        return null;
    }

    private static Customers getCustomerById(int id) {
        List<Customers> customers = getCustomers();
        for (Customers c : customers) {
            if (c.getCusId() == id) {
                return c;
            }
        }
        return null;
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
