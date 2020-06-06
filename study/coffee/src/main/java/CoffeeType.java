public enum CoffeeType {
    ESPRESSO("Espresso", 7,0,0),
    CAPPUCCINO("Cappuccino", 13,13,0),
    LATTE("Latte", 7,20,0),
    MOCHA("Mocha", 7,7,7);

    private String name;
    private double coffee;
    private double milk;
    private double chocolate;

    CoffeeType(String name, double coffee, double milk, double chocolate) {
        this.name = name;
        this.coffee = coffee;
        this.milk = milk;
        this.chocolate = chocolate;
    }

    public String getName() {
        return name;
    }

    public double getCoffee() {
        return coffee;
    }

    public double getMilk() {
        return milk;
    }

    public double getChocolate() {
        return chocolate;
    }
}
