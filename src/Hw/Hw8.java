package Hw;

public class Hw8 {
    /*
    Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
     */
    public static String Increment(String str) {
        int num = Integer.valueOf(str);
        num++;

        return Integer.toString(num);
    }


    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "7673562";
        System.out.println(Increment(input2));
        System.out.println(Increment((input1)));
    }
}
