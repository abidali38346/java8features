package decBatch.staticVariable;

public class StaticVariableOverRiddingExample {


    public static void main(String[] args) {
        StaticVariableExample s1 = new StaticVariableExample("name1");
        StaticVariableExample s2 = new StaticVariableExample("name2");

        // overriding static variable {str}
        // if we changed the static variable in class level it will effect on the all the object instances of the class
        StaticVariableExample.str = "CHANGED";

        // if we changed the static variable on object level it will effect on the all the object instances of the class
//        s1.str = "CHANGED";

        // if we changed the static variable on object level it will effect on the all the object instances of the class
//        s2.str = "CHANGED";

        s1.display();
        s2.display();
    }

}
