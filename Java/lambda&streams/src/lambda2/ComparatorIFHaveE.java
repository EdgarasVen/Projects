package lambda2;

import java.util.Comparator;

public class ComparatorIFHaveE implements HaveCharE, Comparator<String> {
    public int compare(String o1, String o2) {
        if (o1.contains("e") && o2.contains("e")) {
            int c1=0; int c2=0;
            for (int i = 0; i < o1.length(); i++) {
                if(o1.charAt(i)=='e')  c1++;
            }
            for (int i = 0; i < o2.length(); i++) {
                if(o2.charAt(i)=='e')  c2++;
            }
            return c2-c1;
        }
        if (o1.contains("e")) return -1;
        else return 1;
    }
}
@FunctionalInterface
interface HaveCharE {
    int compare(String o1,String o2);
}