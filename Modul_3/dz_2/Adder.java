package Modul_3.dz_2;

/**
 * Created by Z570 on 09.02.2017.
 */
public class Adder extends Arithmetic {

    public static void main(String[] args) {
        Adder calculateSumAndComparison = new Adder();
        System.out.println(calculateSumAndComparison.add(5,5));
        System.out.println(calculateSumAndComparison.check(1,2));
    }

    public boolean check(int a, int b){

        return( a>= b);
    }
}
