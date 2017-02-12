package Modul_3.dz_2;

/**
 * Created by Z570 on 09.02.2017.
 */
public class Adder extends Arithmetic {

    public static void main(String[] args) {
        Adder calculateSumAndComparison = new Adder();
        calculateSumAndComparison.add();
        calculateSumAndComparison.check();
    }

    private void check(){
        int a = super.getA();
        int b = super.getB();
        boolean checker;
        if( a>= b) {
            checker = true;
        }else{
            checker = false;
        }

        System.out.println(checker);
    }
}
