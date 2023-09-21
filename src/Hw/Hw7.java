package Hw;

import java.util.ArrayList;

public class Hw7 {
    /*
    You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
     */
    public static void main(String[] args) {
ArrayList<String>words=new ArrayList<>();
words.add("Adrian");
        words.add("Art");
        words.add("Hello");
        words.add("hi");

     for(String x:words){
         if(x.startsWith("A")){
             System.out.println(x.toLowerCase());
         }
     }


        }
    }



