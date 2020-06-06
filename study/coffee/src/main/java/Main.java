public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(
                new Storage(100),
                new Storage(100),
                new Storage(100)
        );
        machine.fillMilk(100);
        machine.fillCoffee(100);
        machine.fillChocolate(100);

        machine.on();
        machine.makeCoffee(CoffeeType.CAPPUCCINO);
        machine.makeCoffee(CoffeeType.MOCHA);

        machine.checkIsMachineClean();
    }
}
