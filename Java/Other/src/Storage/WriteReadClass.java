package Storage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteReadClass {

    public void writeToCsvFile(List<String[]> thingsToWrite, String separator, String fileName){
        try (FileWriter writer = new FileWriter(fileName)){
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if(i < (strings.length-1))
                        writer.append(separator);
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // creates csv file
    public List<String[]> readFromCsvFile(String separator, String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            List<String[]> list = new ArrayList<>();

            String line = "";
            while((line = reader.readLine()) != null){
                String[] array = line.split(separator);
                list.add(array);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    } // reads from csv and converts it to list of string arrays
    public List<Item> convertToItemList(List<String[]> list){
        List<Item> itemList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            String[] st = list.get(i);
            itemList.add(new Item(st[0],st[1],st[2],st[3]));
        }
        return sortByNameAndDeleteDuplicates(itemList);
    } // converts list of strings into list of objects
    public List<String[]> convertToStringList(List<Item> itemList, List<String[]> stringList){
        List<String[]> list = new ArrayList<>();
        list.add(stringList.get(0));
        String line = "";
        for (Item item: itemList
             ) {
            line=item.converter();
            String[] array = line.split(",");
            list.add(array);
        }
     return list;
    } // reversed convert from list of objects
    public List<Item> sortByNameAndDeleteDuplicates(List<Item> list){ // sort and deletes all duplicates
       list.sort((o1,o2) -> {
           if(o1.getName().compareTo(o2.getName())==0)
               if(o1.getCode().compareTo(o2.getCode())==0)
                   if(o1.getExpDate().compareTo(o2.getExpDate())==0){
                       int sum= Integer.parseInt(o1.getQuantity())+Integer.parseInt(o2.getQuantity()); // if exist duplicate , sums all quantity
                       o1.setQuantity(String.valueOf(sum));
                       o2.setQuantity("null"); // if duplicate set quantity null
                   }
                    else return o1.getExpDate().compareTo(o2.getExpDate());
                else return o1.getCode().compareTo(o2.getCode());
            return o1.getName().compareTo(o2.getName());
       });
       list.removeIf(item -> item.getQuantity().equals("null")); // deletes all objects with quantity==null
     return list;
    } //
}