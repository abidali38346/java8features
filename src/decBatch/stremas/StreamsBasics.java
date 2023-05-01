package decBatch.stremas;

import java.util.Arrays;
import java.util.List;

public class StreamsBasics {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee e1 = new Employee(123456, "Salman", 26, "Male", "B.E.");
        Employee e2 = new Employee(234567, "Sana", 25, "Female", "B.S.C.");
        Employee e3 = new Employee(345678, "Ahad", 28, "Male", "C.S.C.");
        Employee e4 = new Employee(456789, "Simra", 25, "Female", "B.E.");
        Employee e5 = new Employee(567891, "Ayesha", 24, "Female", "B.C.A.");
        Employee e6 = new Employee(678910, "Sadiq", 32, "Male", "B.E.");
        Employee e7 = new Employee(345678, "Afrin", 30, "Female", "M.S.C.");
        Employee e8 = new Employee(345678, "Sai", 33, "Male", "B.E.");
        Employee e9 = new Employee(345678, "Ramesh", 28, "Male", "B.C.A.");
        Employee e10 = new Employee(345678, "Jeevan", 25, "Male", "M.B.A.");

        List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

        Students s1 = new Students(123, "Altaf", 10, 45, 550);
        Students s2 = new Students(234, "Ahad", 9, 55, 450);
        Students s3 = new Students(456, "Sai", 10, 78, 457);
        Students s4 = new Students(567, "Zara", 9, 45, 550);
        Students s5 = new Students(678, "Simra", 8, 15, 540);
        Students s6 = new Students(789, "Charan", 7, 10, 360);
        Students s7 = new Students(910, "Ramesh", 2, 66, 310);
        Students s8 = new Students(101, "Salma", 10, 56, 490);

        List<Students> stuList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);

        Customers c1 = new Customers(7871131, "Ali", 54165464, 5500, "Nellore");
        Customers c13 = new Customers(7871131, "Ali", 54165464, 5500, "Nellore");
        Customers c2 = new Customers(7446461, "Ahad", 455687854, 5440, "Chennai");
        Customers c3 = new Customers(4141184, "Riya", 545151544, 2000, "Hyderabad");
        Customers c4 = new Customers(4186444, "Ramesh", 515151551, 5000, "Chennai");
        Customers c5 = new Customers(5515544, "Sai", 45155785, 4665, "Nellore");
        Customers c6 = new Customers(1545444, "Siva", 54541111, 4000, "Kadapa");
        Customers c7 = new Customers(4845151, "Chirag", 85664524, 1000, "Chennai");
        Customers c8 = new Customers(4867151, "Afrin", 41611585, 2000, "Hyderabad");
        Customers c9 = new Customers(4616166, "Nihal", 68461335, 1000, "Bangalore");
        Customers c10 = new Customers(4541514, "Tanvi", 46416161, 64500, "Bangaore");
        Customers c11 = new Customers(1515155, "Siraj", 64641631, 5440, "Pune");

        List<Customers> cusList = Arrays.asList(c1, c13, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11);

        long count = cusList.stream().count();
        System.out.println(count);

//		for (int i = 0; i < cusList.size(); i++) {
//			if (cusList.get(i).getCusName().indexOf("A") != -1) {
//				System.out.println(cusList.get(i));
//			}
//		}


//		cusList.stream()
//		.filter(cus -> cus.getCusName().indexOf("A") == -1)
//		.forEach(System.out::println);

//		cusList.stream()
//		.filter(cus -> cus.getOrderTotal() > 2000 || cus.getCusName().indexOf("a") == -1)
//				.forEach(System.out::println);

//		Object[] collect = cusList.stream().map(cus -> cus.getCusName().toUpperCase()).toArray();
//		Arrays.asList(collect).stream().forEach(System.out::println);

//		cusList.stream().map(cus -> cus.getOrderTotal()).sorted((o1, o2) -> o2.compareTo(o1))
//				.forEach(System.out::println);

//		if(c1 != c13) System.out.println(1);

//		cusList.stream().map(cus -> cus.getCusId()).distinct().forEach(System.out::println);

//		for (int i = 0; i < cusList.size(); i++) {
//			if (i < cusList.size() - 1 && cusList.get(i).getCusName() != cusList.get(i + 1).getCusName()) {
//				System.out.println(cusList.get(i));
//			}
//		}


    }

}
