package Module_6;

import java.util.Arrays;

/**
 * Created by Z570 on 31.03.2017.
 */
public class ArraysMain {

    public static int [] intArray = {1, 2, 3, 10, -5, 8, -3, -2, 7, 6};

    public static void main(String[] args) {
        System.out.println("Sum Of Array: " + ArraysUtils.sumOfArray(intArray));
        System.out.println("Min Element Of Array: " + ArraysUtils.minElementOfArray(intArray));
        System.out.println("Max Element Of Array: " + ArraysUtils.maxElementOfArray(intArray));
        System.out.println("Max Positive In Array: " + ArraysUtils.maxPositive(intArray));
        System.out.println("Multiplication Of Array: " + ArraysUtils.multiplication(intArray));
        System.out.println("Modulus Of Array: " + Arrays.toString(ArraysUtils.modulusOfArray(intArray)));
        System.out.println("Second Largest In Array: " + ArraysUtils.secondLargest(intArray));
        System.out.println("Reverse Of Array: " + Arrays.toString(ArraysUtils.reverse(intArray)));
        System.out.println("Find Even In Array: " + Arrays.toString(ArraysUtils.findEvenElements(intArray)));

    }
}
