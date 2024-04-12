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
        array = inputArray;
        arrayList = new ArrayList<>(Arrays.asList(inputArray)); // making array int    o arraylist because its mutable
    }


    public int getNumberOfOccurrences(T valueToEvaluate) {
        // initialize Occurrence counter to 0;
        int occurrenceCount = 0;

        // loop through arrayList
        for (int i = 0; i < arrayList.size(); i ++) {

            // assign i to T value
            T value = arrayList.get(i);

            // if value is equal to parameter
            if (value.equals(valueToEvaluate)) {

                // increment count
                occurrenceCount++;
            }

        }
        return occurrenceCount;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        // initialize mostCommon to first element of array
        T mostCommon = arrayToMerge[0];

        //loop through the parameter array starting at 1 because index 0 is already going to be used to compare
        for (int i = 1; i < arrayToMerge.length; i++) {

            // assign i to T element because we need a generic to call numOfOcc method
            T element = arrayToMerge[i];

            // check if current index occurs more times than what is currently assigned to mostCommon
            if ( getNumberOfOccurrences(element) > getNumberOfOccurrences(mostCommon)) {

                // re-assign mostCommon if it does
                mostCommon = element;
            }
        }
        return mostCommon;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {

        //added array to arraylist via constructor
        arrayList.addAll(Arrays.asList(arrayToMerge));

        return getNumberOfOccurrences(valueToEvaluate);
    }

    public T[] removeValue(T valueToRemove) {

        for (int i = 0; i < arrayList.size(); i++) {

            T value = arrayList.get(i);

            if (value.equals(valueToRemove)) {

//                newList.add(value);
                arrayList.remove(value);
            }
        }
        System.out.println(arrayList);
        array = Arrays.copyOfRange(array, 0, arrayList.size());


        int i = 0;

        for (T index : arrayList) {

            array[i] = index;

            i++;
        }
        return array;
//        for (int i = 0; i < this.arrayList.size(); i ++) {
//
//            // assign i to T value
//            T value = this.arrayList.get(i);
//
//            // if value is equal to parameter
//            if (value.equals(valueToRemove)) {
//                this.arrayList.remove(value);
//            }
//        }
//        return arraylist;
//    }
//        ArrayList<T> newList = new ArrayList<>();





//      return (T[]) arrayList.toArray();
    }
}