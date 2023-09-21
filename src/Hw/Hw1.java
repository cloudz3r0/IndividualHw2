package Hw;

public class Hw1 {
    /*
    Write a program to swap 2 String without a temporary variable?
*/
    public static void main(String[] args) {
        String str1="Hello";
    String str2="Hi world";
        System.out.println("Before swap");
        System.out.println(str1);
        System.out.println(str2);
    str1=str1+str2;//HelloWorld
    str2=str1.substring(0,str1.length()-str2.length());
    str1=str1.substring(str2.length());
        System.out.println("After Swap");
        System.out.println(str1);
        System.out.println(str2);
}
}
