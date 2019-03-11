public class Main {

    public static void main(String[] args) {
        String greeting = "   Hello Wrodl    ";
        System.out.println(complexGreetingProcessor(null ));
        System.out.println("debug log line1");
        doNothingTwiceAsHard();
        System.out.println("debug log line2");
        doNothing();
    }

    private static void doNothing() {
        System.out.println("nothing");
    }

    private static String complexGreetingProcessor(String greeting) {
        return greeting.trim();
    }

    private static void doNothingTwiceAsHard() {
        System.out.println("nothing");
    }
}
