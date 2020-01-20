package lambda2;

public class ElementUtils {
    public static <T> T betterElement(T t1, T t2, Predicate<T> element){
        return  (element.betterElement(t1,t2)?t1 : t2);
    }

}
interface Predicate <T>{
    boolean betterElement(T t1, T t2);
}