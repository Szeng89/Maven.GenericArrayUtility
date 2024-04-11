package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    ArrayList<T> arrayList;
    T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array=inputArray;
        this.arrayList = new ArrayList<>(Arrays.asList(inputArray));
    }


    public int getNumberOfOccurrences(T valueToEvaluate) {
        return 0;
    }
}
