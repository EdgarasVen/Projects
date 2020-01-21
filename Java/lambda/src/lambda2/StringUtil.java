package lambda2;

public class StringUtil  {
    public static <T> T betterString(T st1, T st2, BetterString<T> lambda){
        return lambda.betterString(st1,st2) ? st1 : st2;
    }
}
@FunctionalInterface
interface BetterString<T> {
    boolean betterString(T st1, T st2);
}