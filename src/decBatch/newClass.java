package decBatch;

public class newClass {
    private static String transfromString(String input1, int input2) {
        String output = "";
        String number = "";
        for (char c : input1.toCharArray()) {
            if (Character.isDigit(c)) {
                number += c;
            } else {
                if (!number.equals("")) {
                    int n = Integer.parseInt(number);
                    int quotient = n / input2;
                    int remainder = n % input2;
                    if (remainder == 0) {
                        String alpha = Character.toString(c);
                        output += repeat(alpha, factorial(quotient));
                    } else {
                        output += repeat(Character.toString(c), remainder);
                    }
                    number = "";

                }
            }
        }
        return output;

    }

    public static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);

        }
        return sb.toString();

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;

        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        String input1 = "1G5A6B";
        int input2 = 3;
        String output = transfromString(input1, input2);
        System.out.println(output);

        input1 = "1G5H10J";
        input2 = 5;
        output = transfromString(input1, input2);
        System.out.println(output);

        input1 = "1G6H9C";
        input2 = 2;
        output = transfromString(input1, input2);
        System.out.println(output);

        input1 = "8K10G12B";
        input2 = 4;
        output = transfromString(input1, input2);
        System.out.println(output);

    }

}