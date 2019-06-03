package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

public class OccurrenceCounter {

    private ArrayList<Object> keys;
    private ArrayList<Integer> values;

    public OccurrenceCounter(Object[] objectArray){
        //this.objectArray = objectArray;
        keys = new ArrayList();
        values = new ArrayList();

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
    }

    public Object getMostOccurringObject(){
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

    public Object getLeastOccurringObject(){
        Integer min = Integer.MAX_VALUE;
        Object retVal = null;
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) < min){
                min = values.get(i);
                retVal = keys.get(i);
            }
        }
        return retVal;
    }
}
