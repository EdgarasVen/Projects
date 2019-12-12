import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> list;

    public Hand() {
        list = new ArrayList<>();
    }

    public void add(Card card){
        list.add(card);
    }

    public void print(){
        list.forEach(System.out::print);
    }

    public void sort(){
        list.sort(Comparator.naturalOrder());
    }
    public void sum(){

    }

    @Override
    public int compareTo(Hand o) {
        return 0;
    }
}
