package Module_6;

/**
 * Created by Z570 on 01.04.2017.
 */
public class CitizenFactory {

    // English -------------------------------------------------------------------
    private static class Englishman implements Citizen{
        final String hello = "Hello!";

        @Override
        public String sayHello() {
            return this.hello;
        }
    }

    public static Citizen englishman() {
        return new Englishman();
    }
    // China -------------------------------------------------------------------
    private static class Chinese implements Citizen{
        final String hello = "你好！";

        @Override
        public String sayHello() {
            return this.hello;
        }
    }

    public static Citizen chinese() {
        return new Chinese();
    }
    // Russian -------------------------------------------------------------------
    private static class Russian implements Citizen{
        final String hello = "Привет!";

        @Override
        public String sayHello() {
            return this.hello;
        }
    }

    public static Citizen russian() {
        return new Russian();
    }

    // Italian -------------------------------------------------------------------
    private static class Italian implements Citizen{
        final String hello = "Saluti!";

        @Override
        public String sayHello() {
            return this.hello;
        }
    }

    public static Citizen italian() {
        return new Italian();
    }
}
