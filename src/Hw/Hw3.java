package Hw;

public class Hw3 {
    public static void main(String[] args) {

        checkPalindrome("racecar");
        checkPalindrome("hello");
    }

    static void checkPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        System.out.println("Word is " + word);
        System.out.println("Reversed is " + reversed);

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
