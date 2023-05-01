package decBatch._Streams;

import java.util.ArrayList;
import java.util.List;

public class _SessionOne {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 0, 0, 0, 0, 51, 1782, 1972, 616);

        ArrayList<Integer> out = new ArrayList<>();
//        for (int n : nums) {
//            if (n > 0) out.add(n);
//        }
//        for (int n : out) {
//            System.out.println(n);
//        }

        List.of(1, 2, 0, 0, 0, 0, 51, 1782, 1972, 616).stream()
                .filter(n -> n > 0);
//                .forEach(n-> System.out.println(n));


        List<Student> students = List.of(new Student(15, "student1", "IT employee", "chennai"),
                new Student(17, "student2", "sales employee", "chennai"),
                new Student(33, "student3", "beldar mestri", "nellore"),
                new Student(25, "student4", "IT employee", "chennai"),
                new Student(29, "student4", "IT employee", "nellore")
        );


//        ArrayList<Student> studentOut = new ArrayList<>();
//        for (Student s: students) {
//            if(s.getAge() > 20 && s.getLocation().toLowerCase().equals("nellore")){
//                studentOut.add(s);
//            }
//        }
//        for (Student s: studentOut) {
//            System.out.println(s.toString());
//        }

        Integer output = students.stream()
                .filter(s -> s.getAge() > 20 && s.getLocation().toLowerCase().equals("nellore"))
                .map(s -> s.getAge())
                .min((o1, o2) -> o1.compareTo(o2))
                .get();

        students.stream()
                .filter(s->s.getAge() == output)
                .forEach(System.out::println);

//        System.out.println(output);


    }
}

class Student {
    private int age;
    private String name;
    private String occupation;
    private String location;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student() {
    }

    public Student(int age, String name, String occupation, String location) {
        this.age = age;
        this.name = name;
        this.occupation = occupation;
        this.location = location;
    }
}

