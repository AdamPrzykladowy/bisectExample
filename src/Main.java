public class Main {

    public static void main(String[] args) {
        String greeting = "   Hello World    ";
        System.out.println(complexGreetingProcessor(greeting));
        doNothingTwiceAsHard()
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
