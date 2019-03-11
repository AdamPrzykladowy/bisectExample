public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        doNothingTwiceAsHard();
        doNothing();
    }

    private static void doNothing(){
        System.out.println("nothing");
        return;
    }

    private static void doNothingTwiceAsHard(){
        System.out.println("nothing");
        return;
    }
}
