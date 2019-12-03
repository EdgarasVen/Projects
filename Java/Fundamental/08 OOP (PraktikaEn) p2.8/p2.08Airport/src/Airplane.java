public class Airplane extends Airport{
    private String id ;
    private int capacity;
    public Airplane(String id,int capacity){
        this.id=id;
        this.capacity=capacity;
    }
    public String getId() {
        return id;
    } // need for check ID , if plane exists
    @Override
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
}
