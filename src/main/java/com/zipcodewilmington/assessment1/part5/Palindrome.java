package com.zipcodewilmington.assessment1.part5;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer counter = 0;
        for(int i = 1; i < input.length(); i++){
            for(int j = 0; j < input.length()-i; j++){
                if(isPalindrome(input.substring(j,j+i+1))){
                    counter++;
                }
            }
        }
        return counter + input.length();
    }

    public Boolean isPalindrome(String str){
        str = str.toLowerCase();
        String front = str.substring(0,str.length()/2);
        StringBuilder sbuild = new StringBuilder(str.substring(str.length()/2 + str.length()%2));
        String back = sbuild.reverse().toString();
        return front.equals(back);
    }

}


