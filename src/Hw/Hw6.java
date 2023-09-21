package Hw;

import java.sql.SQLOutput;



public class Hw6 {


    /*
         Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.
         */
    public static char findRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isRepeated = true;
                }
            }
       if(!isRepeated){
           return currentChar;
       }
        }
        return '\0';
    }
}
class Test {
    public static void main(String[] args) {
 String input="abracadabra";
 char result=Hw6.findRepeatingChar(input);
if(result !='\0'){
    System.out.println("This character doesnt repeat "+result);
}else{
    System.out.println("No non repeating characters in string.");
}
}

    }




