package dbfromtxtfile;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> readFromFile(String fileName){
        try {
            BufferedReader reader= new BufferedReader(new java.io.FileReader(fileName));
            List<String> list =new ArrayList<>();
            String line="";
            while((line=reader.readLine())!=null){
                list.add(line);
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    if(list.get(i).equals(list.get(j))){
                        return null;
                    }
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
