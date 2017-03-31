package Module_6;

import java.util.ArrayList;
/**
 * Created by Z570 on 31.03.2017.
 */
public final class ArraysUtils {

    // SUM ----------------------------------------------------
    public static int sumOfArray(int[] intArray) {
        int resultSumOfArray = 0;
        for( int i : intArray) {
            resultSumOfArray += i;
        }
        return resultSumOfArray;
    }

    // MIN -----------------------------------------------------
    public static int minElementOfArray(int[] intArray) {
        int minval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]< minval)
                minval = intArray[i];
        }
        return minval;
    }

    // MAX -----------------------------------------------------
    public static int maxElementOfArray(int[] intArray) {
        int maxval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]>maxval)
                maxval = intArray[i];
        }
        return maxval;
    }

    // maxPositive ----------------------------------------------
    public static int maxPositive(int[] intArray) {
        int maxval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]>maxval && intArray[i]>0)
                maxval = intArray[i];
        }
        return maxval;
    }

    // multiplication --------------------------------------------
    public static int multiplication(int[] intArray) {
        int mult = intArray[0];
        for(int i = 1; i != intArray.length; i ++){
            mult *= intArray[i];
        }
        return mult;
    }

    // modulus of first and last element -------------------------
    public static int[] modulusOfArray(int[] intArray) {
        int[] moduleArray = new int[intArray.length];
        for(int i = 0; i != intArray.length; i ++){
            moduleArray[i] = Math.abs(intArray[i]);
        }
        return moduleArray;
    }
    // second largest element ---------------------------------------
    public static int secondLargest(int[] intArray) {
        int fLargest;
        int sLargest;
        if(intArray[0] > intArray[1]){
            fLargest = intArray[0];
            sLargest = intArray[1];
        }else{
            fLargest = intArray[1];
            sLargest = intArray[0];
        }
        for(int i = 2; i != intArray.length; i ++){
            if(intArray[i] > fLargest){
                sLargest = fLargest;
                fLargest = intArray[i];
            }else if(intArray[i] > sLargest){
                sLargest = intArray[i];
            }
        }
        return sLargest;
    }

    // Reverse element ---------------------------------------
    public static int[] reverse(int[] intArray){
        int[] reverseArray = new int[intArray.length];
            for (int i=0; i<intArray.length; i++){
                reverseArray[i] = intArray[intArray.length - 1 - i];
            }
        return reverseArray;
    } /* arranges array elements backwards */

    // Finds even numbers ---------------------------------------
    public static int[] findEvenElements(int[] intArray){
        ArrayList<Integer> evenElementsArray = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 == 0){
                evenElementsArray.add(intArray[i]);
            }
        }

        int[] evenIntElementsArray = new int[evenElementsArray.size()];
        for (int i = 0; i < evenElementsArray.size(); i++) {
            evenIntElementsArray[i] = evenElementsArray.get(i);
        }
        return evenIntElementsArray;
    }/* finds even numbers in the array */


}
