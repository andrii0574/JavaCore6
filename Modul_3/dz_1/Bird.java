package Modul_3.dz_1;

/**
 * Created by Z570 on 09.02.2017.
 */
public class Bird {
    private static final String  bird = "I am walking \nI am flying \nI am singing \nI am Bird \n";
    private String name;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Bird birdSing = new Bird();
        birdSing.sing();

        Bird birdVoody = new Bird("Voody");
        birdVoody.sing();


    }


    private void sing(){
        if(name != null){ System.out.println("I am " + name);}
        System.out.println(bird);
    }


}
