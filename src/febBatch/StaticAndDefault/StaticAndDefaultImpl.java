package febBatch.StaticAndDefault;

public class StaticAndDefaultImpl implements StaticAndDefaultInterface {


    public static void main(String[] args) {
        // invoking static method
        int add = StaticAndDefaultInterface.add(11, 19);
//       System.out.println(add);

        // invoking default method
        StaticAndDefaultInterfaceImpl ss = new StaticAndDefaultInterfaceImpl();
        int i = ss.add1(11, 19);
        System.out.println(i);

    }

}
