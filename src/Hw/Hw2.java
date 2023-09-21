package Hw;

public class Hw2 {
    /*
    Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
     */
    public static void main(String[] args) {
        String str = "Sunday";
        String reversed="";
        System.out.println("Original is " + str);
        for (int i = str.length()-1; i >= 0; i--) {


            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);
    }
}


