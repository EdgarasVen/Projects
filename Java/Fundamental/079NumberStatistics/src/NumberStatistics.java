
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum=0;
    private int even=0;
    private int odd=0;

    public NumberStatistics(){

    }
    public void addNumber(int number){
        sum+=number;
        amountOfNumbers++;
        if (number%2==0)
            even+=number;
        else odd+=number;

    }
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
    public int sum(){
        return sum;
    }
    public int even(){
        return even;
    }
    public int odd(){
        return odd;
    }
    public float average(){
        return (float) sum/amountOfNumbers;
    }
}
