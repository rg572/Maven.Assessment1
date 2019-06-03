package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if(j <= 1){
            return k;
        }
        else{
            return k/j + k%j;
        }
    }
}
