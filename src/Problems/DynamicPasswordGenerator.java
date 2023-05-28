package Problems;

public class DynamicPasswordGenerator {
    public static void main(String[] args) {
        String s = passwordGenerator(10);
        System.out.println(s);
    }

    private static String passwordGenerator(int val) {

//        for (int i = 0; i < val; i++) {
//            if (Math.floor(Math.random() * 9) != 0) {
//                pas += "" + (int) Math.floor(Math.random() * 9);
//            } else {
//                pas += "" + 1;
//            }
//        }
        String pas = "";
//      return pass;


//        recurssive approach
        if (val == 0) {
            return "";
        }
        return (int) Math.floor(Math.random() * 9) + passwordGenerator(val - 1);
    }

}
