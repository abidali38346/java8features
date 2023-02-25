package functionalInterface;

public class InvokingFuncInterface {

    public static void main(String[] args) {
        String name = "jsndk";
        String name1 = "jsndk";
        String name2 = "jsndk";
        // invoking functional interface with the help of lambda expression

        // implementaion of the abstract method
        FuncInterface func = (str, str1, str2) -> str + str1 + str2;

        // invoking the abstract method
        String out = func.name(name, name1, name2);
        System.out.println(out);

    }


}
