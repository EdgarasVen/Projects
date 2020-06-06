public class Counter {

    private int value;
    private boolean check=false;

    public Counter (int statingValue, boolean check){
        value=statingValue;
        this.check=check;
    }

    public Counter (int statingValue){
        value=statingValue;
    }

    public Counter ( boolean check){
        value =0;
        this.check=check;
    }

    public Counter (){
        value=0;
        check=false;
    }

    public int value(){
        return value;
    }

    public void increase(){
        value+=1;
    }

    public void decrease(){
        value-=1;
        if (value<0)
            value=0;
    }

    public void increaseAmount(int amount){
        value+=amount;
    }

    public void decreaseAmount(int amount){
        value-=amount;
        if (value<0)
            value=0;
    }

}
