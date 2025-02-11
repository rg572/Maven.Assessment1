package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = str.toLowerCase();
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sbuild  = new StringBuilder(str);
        return sbuild.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        if(str.length() <= 2){
            return "";
        }
        else{
            return(str.substring(1,str.length()-1));
        }
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] strAsCharArray = str.toCharArray();
        for(int i = 0; i < strAsCharArray.length; i++){
            if(Character.isUpperCase(strAsCharArray[i])){
                strAsCharArray[i] = Character.toLowerCase(strAsCharArray[i]);
            }
            else if(Character.isLowerCase(strAsCharArray[i])){
                strAsCharArray[i] = Character.toUpperCase(strAsCharArray[i]);
            }
        }
        return new String(strAsCharArray);
    }
}
