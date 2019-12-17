package generics;

import java.util.List;

public class ElementUtils {

    public static <T> T lastElement (List<T> list){
        return (T)list.get(list.size()-1);
    }

    public static <T> T lastElement (T[] array){
        return (T) array[array.length-1];
    }


}
