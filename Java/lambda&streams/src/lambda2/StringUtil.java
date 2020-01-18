package lambda2;

public class StringUtil {
    public static String betterString(String st1, String st2, BetterString lambda){
        return lambda.betterString(st1,st2) ? st1 : st2;
    }
}
@FunctionalInterface
interface BetterString {
    boolean betterString(String st1, String st2);
}