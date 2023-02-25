package staticVariable;

public class StaticVariableExample {
    public static String str = "NOT_CHANGED";

    private String name;

    public StaticVariableExample() {
    }

    public StaticVariableExample(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(str);
    }


}

