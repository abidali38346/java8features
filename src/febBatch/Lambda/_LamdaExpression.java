package febBatch.Lambda;

public class _LamdaExpression {
    public static void main(String[] args) {

//  Advantages of lambda expression:-
//        No need to implement the interface and no need to override (no polymorphism)
//        simple syntax, easy readability
//        no need to creating object (or) class instance

//        invoking functional interface abstract method with the help of lambda expressions
        _FunctionalInterface a = (s, n) -> {
            if (s.startsWith("a")) return s;
            return "";
        };

        String string = a.appendString("abc", 10);

        System.out.println(string);

    }

}
