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
        String back = str.substring(str.length()/2 + str.length()%2);
        //System.out.println("front: " + front + "     back: " + back);
        return front.equals(back);
    }


    @Test
    public void isPalindromeTest1(){
        String input = "aa";

        Boolean output = isPalindrome(input);

        Assert.assertTrue(output);
    }

    @Test
    public void isPalindromeTest2(){
        String input = "ab";

        Boolean output = isPalindrome(input);

        Assert.assertFalse(output);
    }

    @Test
    public void isPalindromeTest3(){
        String input = "aaa";

        Boolean output = isPalindrome(input);

        Assert.assertTrue(output);
    }

    @Test
    public void isPalindromeTest4(){
        String input = "aab";

        Boolean output = isPalindrome(input);

        Assert.assertFalse(output);
    }
}


