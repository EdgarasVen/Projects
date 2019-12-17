import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> map;

    public Dictionary() {
        map=new HashMap<>();
    }

    public String translate(String word){
        return map.getOrDefault(word, null);
    }
    public void add(String word, String translation){
        map.put(word,translation);
    }

    public int amountOfWords(){
        return map.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<>();
        for (String string: map.keySet()
             ) {
            list.add(string+" = "+map.get(string));
        }
        return list;
    }
}
