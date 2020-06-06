import java.util.ArrayList;
import java.util.Objects;

public class Person implements Comparable<Person>{
     private String name;
     private ArrayList<Integer> numbersList = new ArrayList<>();
     private String addressCity;
     private String addressStreet;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int number) {
        this.name = name;
        numbersList.add(number);
    }
    public Person(String name, int number, String addressCity, String addressStreet) {
        this.name = name;
        numbersList.add(number);
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
    }
    public void addAddress(String city, String street){
        addressCity =city;
        addressStreet =street;
    }
    public void addNumber(int number){
         numbersList.add(number);
    }
    public boolean searchByNumber(int number){
        for (int i = 0; i < numbersList.size(); i++) {
            if(numbersList.get(i)==number) return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return
                "name = " + name +
                ", tel. numbers = " + numbersList +
                ", City = " + addressCity +
                ", Street = " + addressStreet +"\n";
    }
    @Override
    public int compareTo(Person o) {
        return toString().compareTo(o.toString());
    }
}
