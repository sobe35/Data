package com.programpractice.demo;

public class Palindrome {

    public static void main(String[] args) {
        String str = "ababa";
        str = str.toLowerCase();
        

    }

    public static boolean isPalindrome(String str){
        int i =0;
        int j =str.length()-1;
        
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return  true;
    }

   
}
