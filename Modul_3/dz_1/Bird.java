package Modul_3.dz_1;

/**
 * Created by Z570 on 09.02.2017.
 */
public class Bird {
    public static void main(String[] args) {
        Bird birdSing = new Bird();
        birdSing.sing("I am walking");
        birdSing.sing("I am flying");
        birdSing.sing("I am singing");
        birdSing.sing("I am Bird");
    }

    private void sing(String song){
        System.out.println(song);
    }
}
