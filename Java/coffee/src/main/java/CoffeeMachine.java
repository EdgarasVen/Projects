public class CoffeeMachine {
    private boolean enable =false;
    private int cleanCheck = 7;
    private Storage milkStorage;
    private Storage coffeeStorage;
    private Storage chocolateStorage;

    public CoffeeMachine(Storage milkStorage, Storage coffeeStorage, Storage chocolateStorage) {
        this.milkStorage = milkStorage;
        this.coffeeStorage = coffeeStorage;
        this.chocolateStorage = chocolateStorage;
    }

    public void on (){
        enable =true;
    }
    public void off (){
        enable =false;
    }
    private void stateChecker(){
        if (enable==false) throw new IllegalStateException("Coffee Machine is not enabled");
    }

    public void fillMilk(double amount){
        milkStorage.fill(amount);
    }

    public void fillCoffee(double amount){
        coffeeStorage.fill(amount);
    }

    public void fillChocolate(double amount){
        chocolateStorage.fill(amount);
    }

    public void makeCoffee(CoffeeType type){
        stateChecker();
        if (type==null) throw new IllegalArgumentException("coffee type is wrong");
        if (cleanCheck-1<0) throw new IllegalStateException("Coffee machine is too dirty");
        milkStorage.use(type.getMilk());
        coffeeStorage.use(type.getCoffee());
        chocolateStorage.use(type.getChocolate());
        System.out.println(type.getName()+" is ready! ");
        cleanCheck--;
    }

    public void cleanMachine(){
        if(cleanCheck==7) System.out.println("Machine is already clean");
        else cleanCheck=7;
    }

    public void checkIsMachineClean(){
        System.out.println(cleanCheck);
    }

}
