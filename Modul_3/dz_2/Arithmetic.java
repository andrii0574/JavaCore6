package Modul_3.dz_2;

/**
 * Created by Z570 on 09.02.2017.
 */
public class Arithmetic {
    private int a = 3;
    private int b = 5;

    public int getA() {
        return this.a;
    }
    public int getB() {
        return this.b;
    }

    protected void add(){
        int sum = this.a + this.b;
        System.out.println(sum);
    }


}
