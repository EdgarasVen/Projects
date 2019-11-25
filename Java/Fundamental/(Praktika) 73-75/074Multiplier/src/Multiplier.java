public class Multiplier {
    private int number;
    public Multiplier(int number){
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int multiply(int othernumber){
        return othernumber*number;
    }
}
