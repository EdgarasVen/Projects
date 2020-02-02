import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class DataBase {
    HashMap<String,Person> personsDataBase =new HashMap<>();

    public void addNewPerson(String name){
        personsDataBase.put(name,new Person(name));
    }

    public void addNewPerson(String name,int number){
        personsDataBase.put(name,new Person(name,number));
    }

    public void addNewPerson(String name,int number,String city,String street){
        personsDataBase.put(name,new Person(name,number,city,street));
    }

    public void addNumberToPersonByName(String name,int number){
        if(checkKeyIsExist(name))
        personsDataBase.get(name).addNumber(number);
        else wrongName();
    }

    public void addAddressToPersonByName(String name,String city,String street){
        if(checkKeyIsExist(name))
        personsDataBase.get(name).addAddress(city,street);
        else wrongName();
    }

    public void printAllPersonInformation(){
        System.out.println(personsDataBase);
    }

    private boolean checkKeyIsExist(String name){
        return personsDataBase.containsKey(name);
    }

    public void getInformationByNumber(int number){
        personsDataBase.forEach((name,person)->{
            if(person.searchByNumber(number))
                System.out.println(personsDataBase.get(name).toString());
        });
    }

    public void removePersonAllInformation(String name){
        if(personsDataBase.containsKey(name))
        personsDataBase.remove(name);
        else wrongName();
    }

    public void printSortedByNameAllPersons(){
        ArrayList<Person> personList = new ArrayList<>();
        personsDataBase.forEach((name,person)-> {
            personList.add(person);
        });
        Collections.sort(personList);
        System.out.println(personList);
    }

    private void wrongName(){
        System.out.println("Person with this name doesn't exist");
    }

}