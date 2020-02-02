package lambda3;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static <T> List<T> allMatches(List<T> list , Predicate<T> lambda){
        List<T> newList =new ArrayList<>();
        list.forEach(word-> {
            if (lambda.compare(word))
                newList.add(word);
        });
    return newList;
    }
    static <T,U> List<U> transformedList(List<T> list, Function<T,U> function){
        List<U> newList =new ArrayList<>();
        list.forEach(word-> {
            newList.add(function.transform(word));
        });
     return newList;
    }
}
@FunctionalInterface
interface Predicate<T>{
    boolean compare(T s);
}
interface Function<T,U>{
    U transform(T s);
}