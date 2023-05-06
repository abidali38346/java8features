package febBatch.FunctionalInterfaces;

@FunctionalInterface // this annotation is optional
public interface _FunctionalInterface {
//    definition:- A functional interface is an interface which has only one abstract method
//    we can specify an interface is an functional interface by adding @FunctionalInterface annotation
//    @FunctionalInterface annotation is optional one but added it will be much meaningfull and it will help us not to make errors

//  below a abstract function declared with 2 arguments
    abstract String appendString(String s, int n);

//    abstract String appendString1(String s);

//    abstract String appendString1(String s);
}
