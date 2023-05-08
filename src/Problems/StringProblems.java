package Problems;

public class StringProblems {

    public static void main(String[] args) {
        String string = reverseString("abc");
        System.out.println(string);
    }

    private static String reverseString(String str) {
//        var ans = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            ans += str.charAt(i);
//        }
//        return ans;

//      recursive approach

//        if (str.length() == 1) return str;
//        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));

//        single liner
        return str.length() == 1 ? str : str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));

    }
}
