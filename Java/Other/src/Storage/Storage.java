package storage;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Storage {
    private String name;
    private String separator=",";
    private List<String[]> listOfProducts ;
    private List<Item> listOfItems ;
    private WriteReadClass write;

    public Storage(String name) {
        this.name = name;
        write=new WriteReadClass();
        listOfProducts = write.readFromCsvFile(separator,name) ;
        listOfItems = write.convertToItemList(listOfProducts);
    }

    public void printAllCSV(){
        printFirstAttributes();
        for (Item item: listOfItems) {
            System.out.println(item);
        }
    } // print full csv file
    private void printFirstAttributes(){
        for (int i = 0; i < 22*4; i++) { System.out.print("-"); }
        System.out.println();
        for (int i = 0; i < listOfProducts.get(0).length; i++) {
            System.out.print(String.format("|%-20s|",listOfProducts.get(0)[i]));
        }
        System.out.println();
        for (int i = 0; i < 22*4; i++) { System.out.print("-"); }
        System.out.println();
    } // prints first attributes
    public void searchAndPrintQuantity(int quantity){
        printFirstAttributes();
        for (Item item: listOfItems) {
            if(Integer.parseInt(item.getQuantity())<=quantity)
            System.out.println(item);
        }
    }  // prints products with less imputed quantity
    public void searchAndPrintDate(String year,String month,String day){
        String insertedDate = year+"-"+month+"-"+day;
        printFirstAttributes();
        for (Item item: listOfItems) {
            if (item.getExpDate().compareTo(insertedDate)<1) {
                System.out.println(item);
            }
        }
    } // prints products before inserted date
    public void searchExpiredTodayDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date =new Date();
        String todayDate =formatter.format(date);
        printFirstAttributes();
        for (Item item: listOfItems) {
            if (item.getExpDate().compareTo(todayDate)<1) {
                System.out.println(item);
            }
        }
    } // prints products which date already expired
    public void sortByQuantity(){
        listOfItems.sort(Comparator.comparingInt(o -> Integer.parseInt(o.getQuantity())));
        printAllCSV();
    } // sort table by quantity
    public void sortByExpirationDate(){
        listOfItems.sort(Comparator.comparing(o -> o.getExpDate()));
        printAllCSV();
    } // sort table by expiring date
    public void sortByName(){
        listOfItems.sort(Comparator.comparing(o -> o.getName()));
        printAllCSV();
    } // sort table by name
    public void updateCSV( String fileName){ // creates new file csv
        write.writeToCsvFile(write.convertToStringList(listOfItems,listOfProducts),separator,fileName);
    }
}

