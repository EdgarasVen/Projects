public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(30);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
    }
}
