package Module_6;

/**
 * Created by Z570 on 01.04.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {

        Citizen engl = CitizenFactory.englishman();
        Citizen chin = CitizenFactory.chinese();
        Citizen rus = CitizenFactory.russian();
        Citizen ita = CitizenFactory.italian();
        System.out.println(engl.sayHello());
        System.out.println(chin.sayHello());
        System.out.println(rus.sayHello());
        System.out.println(ita.sayHello());
    }
}
