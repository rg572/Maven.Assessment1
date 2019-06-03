package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Type;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for(Object o : objectArray){
            if(o.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        /*
        if(objectArray[0] instanceof Double) {

            //objectArray = (Integer[]) objectArray;

            ArrayList<Integer> arrList = new ArrayList(Arrays.asList(objectArray));
            while (arrList.remove(objectToRemove)) {
                //arrList.remove(objectToRemove);
            }

            Object[] returnArray = arrList.toArray(new Integer[arrList.size()]);
            //Object[] returnArray = arrList.toArray();
            return returnArray;
        }
        else{ */
            ArrayList<Object> arrList = new ArrayList(Arrays.asList(objectArray));
            while(arrList.remove(objectToRemove)){}
            Object[] returnArray = toTypedArray(arrList);
            return returnArray;
        //}

    }

    // stolen and adapted from https://stackoverflow.com/questions/3152290/java-how-can-i-dynamically-create-an-array-of-a-specified-type-based-on-the-typ
    public static <T> Object[] toTypedArray(ArrayList<Object> objectArrayList){
        Class theClass = objectArrayList.get(0).getClass();
        T[] array = (T[]) java.lang.reflect.Array.newInstance(theClass, objectArrayList.size());
        Object[] retArr = objectArrayList.toArray(array);
        return retArr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        ArrayList<Object> keys = new ArrayList();
        ArrayList<Integer> values = new ArrayList();

        for(int i = 0; i < objectArray.length; i++) {
            Boolean notThere = true;
            for(int j =0; j < keys.size(); j++){
                if(keys.get(j).equals(objectArray[i])){
                    notThere = false;
                    values.set(j, values.get(j)+1);
                    break;
                }
            }
            if(notThere){
                keys.add(objectArray[i]);
                values.add(1);
            }
        }

        Integer max = -1;
        Object retVal = null;
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) > max){
                max = values.get(i);
                retVal = keys.get(i);
            }
        }
        return retVal;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        ArrayList<Object> keys = new ArrayList();
        ArrayList<Integer> values = new ArrayList();

        for(int i = 0; i < objectArray.length; i++) {
            Boolean notThere = true;
            for(int j =0; j < keys.size(); j++){
                if(keys.get(j).equals(objectArray[i])){
                    notThere = false;
                    values.set(j, values.get(j)+1);
                    break;
                }
            }
            if(notThere){
                keys.add(objectArray[i]);
                values.add(1);
            }
        }

        Integer min = objectArray.length + 1;
        Object retVal = null;
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) < min){
                min = values.get(i);
                retVal = keys.get(i);
            }
        }
        return retVal;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        /*
        if(objectArray[0] instanceof Double) {
            ArrayList<Integer> objectArrayList = new ArrayList(Arrays.asList(objectArray));
            ArrayList<Integer> toAdd = new ArrayList(Arrays.asList(objectArrayToAdd));
            objectArrayList.addAll(toAdd);
            return objectArrayList.toArray(new Integer[objectArrayList.size()]);
        }
        else{

         */
            ArrayList<Object> objectArrayList = new ArrayList(Arrays.asList(objectArray));
            ArrayList<Object> toAdd = new ArrayList(Arrays.asList(objectArrayToAdd));
            objectArrayList.addAll(toAdd);
            return objectArrayList.toArray(new Integer[objectArrayList.size()]);
        }
   // }
}
