import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> list;
    private double weightMax;
    private int count=0;

    public Box(double weightMax){
        list = new ArrayList<>();
        this.weightMax=weightMax;
    }
    public void add (ToBeStored obj){
        if(obj.weight()+weight()>weightMax){
            System.out.println("Weight limit!!");
        }
        else {
            list.add(obj);
            count++;
        }
    }

    @Override
    public String toString() {
        return "Box: "+count+" things, total weight "+weight()+" kg";
    }
    public double weight(){
        double weight=0;
        for (ToBeStored box: list
             ) {
            weight+=box.weight();
        }
        return weight;
    }
}
