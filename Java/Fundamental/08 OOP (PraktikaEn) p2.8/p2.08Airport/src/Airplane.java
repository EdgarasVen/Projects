public class Airplane extends Airport{
    private String id ;
    private int capacity;
    public Airplane(){

    }
    public Airplane(String id,int capacity){
        this.id=id;
        this.capacity=capacity;
    }
    public String getId() {
        return id;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
}
