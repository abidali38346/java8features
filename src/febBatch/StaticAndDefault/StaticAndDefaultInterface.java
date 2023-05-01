package febBatch.StaticAndDefault;

public interface StaticAndDefaultInterface {

    // java 8 introduced static and default methods in interface
    // so that we can handle the multiple inheritance problem

    // static method:-
    // we can add default implementation so that we can force developer not to override the implementation
    // we can invoke static method as normal static method of a class.

    // default method :-
    // it is also same as static method but we developer can override the implentation of it when it is necessary
    // to invoke the default method we need to implement the interface with the help of that implementation we can invoke the default method.

    static int add(int a, int b) {
        return a + b;
    }

    static int mul(int a, int b) {
        return a + b;
    }

    default int add1(int a, int b) {
        return a + b;
    }

    default int mul1(int a, int b) {
        return a + b;
    }
}
