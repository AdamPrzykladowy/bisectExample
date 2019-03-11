public class Main {

    public static void main(String[] args) {
        return;
        String greeting = "   Hello Wrodl    ";
        System.out.println(complexGreetingProcessor(greeting));
        doNothingTwiceAsHard()
        System.out.println("debug log line");
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
