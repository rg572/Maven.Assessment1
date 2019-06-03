package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        if(n < 0){
            return -1;
        }
        else {
            return (n * (n+1))/2;
        }
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        if(n < 0){
            return null;
        }
        Integer factorial = 1;
        for(int i = 2; i <= n; i++ ){
            factorial *= i;
        }
        return factorial;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder sbuild = new StringBuilder(val.toString());
        return new Integer(sbuild.reverse().toString());
    }
}
