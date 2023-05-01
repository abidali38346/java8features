package febBatch.StaticAndDefault;

public class StaticAndDefaultInterfaceImpl implements StaticAndDefaultInterface {

    public static void main(String[] args) {
        // invoking static method
        int add = StaticAndDefaultInterface.add(10, 11);
        System.out.println(add);
    }

    // overriding default method
    @Override
    public int add1(int a, int b) {
        return a * b;
    }
}
