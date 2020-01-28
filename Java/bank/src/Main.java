import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal limit = new BigDecimal(-200);
        BigDecimal windraw = new BigDecimal(120);
        BigDecimal b = new BigDecimal(-50);
        System.out.println(b.subtract(windraw));
        // 0-100=-100  -200
        System.out.println(windraw.compareTo(limit));
        if (b.subtract(windraw).compareTo(limit)>=0) {
            b=b.subtract(windraw);
            System.out.println(true);
            System.out.println(b);
        }

    }
}
