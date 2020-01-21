import java.time.LocalDate;

public class CurrencyParameters {
        LocalDate from;
        LocalDate to;
        String type;
        String cur;

        CurrencyParameters(String type, String cur,String from, String to) {
            this.from = LocalDate.parse(from);
            this.to = LocalDate.parse(to);
            this.type = type;
            this.cur = cur;
        }

}
