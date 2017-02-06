package Modul_2.dz_2_1;

/**
 * Created by Z570 on 05.02.2017.
 */
public class SecondModuleFirstDZArray {

    public static void main(String[] args) {
        int [] intArray = {1, 2, 3, 10, -5, 8, -3, -2, 7, 6};
        double [] doubleArray = {1.02, 2.53, 3.28, 10.53, -5.84, -6.82, 7.23, 8.73, -7.06, 7.35};

        SecondModuleFirstDZArray SecondModuleFirstDZArray = new SecondModuleFirstDZArray();

        SecondModuleFirstDZArray.sum(intArray);

        SecondModuleFirstDZArray.sum(doubleArray);

        SecondModuleFirstDZArray.min(intArray);

        SecondModuleFirstDZArray.min(doubleArray);

        SecondModuleFirstDZArray.max(intArray);

        SecondModuleFirstDZArray.max(doubleArray);

        SecondModuleFirstDZArray.maxPositive(intArray);

        SecondModuleFirstDZArray.maxPositive(doubleArray);

        SecondModuleFirstDZArray.multiplication(intArray);

        SecondModuleFirstDZArray.multiplication(doubleArray);

        SecondModuleFirstDZArray.modulus(intArray);

        SecondModuleFirstDZArray.modulus(doubleArray);

        SecondModuleFirstDZArray.secondLargest(intArray);

        SecondModuleFirstDZArray.secondLargest(doubleArray);
    }
// SUM ----------------------------------------------------
    private void sum(int[] intArray) {
        int sum = 0;
        for( int i : intArray) {
            sum += i;
        }
        System.out.println("Sum (int): " + sum);
    }

    public void sum(double [] doubleArray) {
        double sum = 0;
        for( double i : doubleArray) {
            sum += i;
        }
        System.out.println("Sum (double): " + sum);
    }

// MIN -----------------------------------------------------
    private void min(int[] intArray) {
        int minval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]<minval)
                minval = intArray[i];
        }
        System.out.println("Min (int): " + minval);
    }

    private void min(double[] doubleArray) {
        double minval = doubleArray[0];
        for(int i = 0; i != doubleArray.length; i ++){
            if(doubleArray[i]<minval)
                minval = doubleArray[i];
        }
        System.out.println("Min (double): " + minval);
    }
// MAX -----------------------------------------------------
    private void max(int[] intArray) {
        int maxval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]>maxval)
                maxval = intArray[i];
        }
        System.out.println("Max (int): " + maxval);
    }

    private void max(double[] doubleArray) {
        double maxval = doubleArray[0];
        for(int i = 0; i != doubleArray.length; i ++){
            if(doubleArray[i]>maxval)
                maxval = doubleArray[i];
        }
        System.out.println("Max (double): " + maxval);
    }
// maxPositive ----------------------------------------------
    private void maxPositive(int[] intArray) {
        int maxval = intArray[0];
        for(int i = 0; i != intArray.length; i ++){
            if(intArray[i]>maxval && intArray[i]>0)
                maxval = intArray[i];
        }
        System.out.println("maxPositive (int): " + maxval);
    }

    private void maxPositive(double[] doubleArray) {
        double maxval = doubleArray[0];
        for(int i = 0; i != doubleArray.length; i ++){
            if(doubleArray[i]>maxval && doubleArray[i]>0)
                maxval = doubleArray[i];
        }
        System.out.println("maxPositive (double): " + maxval);
    }
// multiplication --------------------------------------------
    private void multiplication(int[] intArray) {
        int mult = intArray[0];
        for(int i = 1; i != intArray.length; i ++){
                mult *= intArray[i];
        }
        System.out.println("multiplication (int): " + mult);
    }

    private void multiplication(double[] doubleArray) {
        double mult = doubleArray[0];
        for(int i = 1; i != doubleArray.length; i ++){
                mult *= doubleArray[i];
        }
        System.out.println("multiplication (double): " + mult);
    }
// modulus of first and last element -------------------------
    private void modulus(int[] intArray) {
        int firstelm = intArray[0];
        int lastelm = intArray[intArray.length - 1];
        System.out.println("modulus of first element (int): " + Math.abs(firstelm));
        System.out.println("modulus of last element (int): " + Math.abs(lastelm));
    }

    private void modulus(double[] doubleArray) {
        double firstelm = doubleArray[0];
        double lastelm = doubleArray[doubleArray.length - 1];
        System.out.println("modulus of first element (double): " + Math.abs(firstelm));
        System.out.println("modulus of last element (double): " + Math.abs(lastelm));
    }
// second largest element ---------------------------------------
    private void secondLargest(int[] intArray) {
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
        System.out.println("second largest element (int): " + sLargest);
    }

    private void secondLargest(double[] doubleArray) {
        double fLargest;
        double sLargest;
        if(doubleArray[0] > doubleArray[1]){
            fLargest = doubleArray[0];
            sLargest = doubleArray[1];
        }else{
            fLargest = doubleArray[1];
            sLargest = doubleArray[0];
        }
        for(int i = 2; i != doubleArray.length; i ++){
            if(doubleArray[i] > fLargest){
                sLargest = fLargest;
                fLargest = doubleArray[i];
            }else if (doubleArray[i] > sLargest){
                sLargest = doubleArray[i];
            }
        }
        System.out.println("second largest element (double): " + sLargest);
    }

}
