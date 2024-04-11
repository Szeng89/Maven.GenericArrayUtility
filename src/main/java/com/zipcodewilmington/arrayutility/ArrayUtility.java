package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> { //made class generic
    ArrayList<T> arrayList;
    T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array=inputArray;
        this.arrayList = new ArrayList<>(Arrays.asList(inputArray)); // making array into arraylist because its mutable
    }


    public int getNumberOfOccurrences(T valueToEvaluate) {
        int occurrenceCount = 0; // initiaize Occurrence counter to 0;

        for (int i = 0; i < this.arrayList.size(); i ++) { // loop through arrayList
            T value = this.arrayList.get(i); // assign i to T value
            if (value.equals(valueToEvaluate)) { // if value is equal to parameter
                occurrenceCount++; // increment count
            }

        }
        return occurrenceCount;
    }
}
