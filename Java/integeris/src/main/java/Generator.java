import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class Generator implements lt.itakademija.exam.IntegerGenerator {
    private Integer numberStart;
    private Integer numberFinish;
    private lt.itakademija.exam.IntegerGenerator generator;
    private NumberFilter filter;
    private boolean filterCheck= true;

    public Generator(int numberStart, int numberFinish) {
        this.numberStart = numberStart;
        this.numberFinish = numberFinish;
    }

    public Generator(lt.itakademija.exam.IntegerGenerator generator, NumberFilter filter) {
        this.generator = generator;
        this.filter = filter;
        filterCheck=false;
    }

    public Integer getNext() {
        if(filterCheck) {
            if (numberStart > numberFinish) return null;
            return numberStart++;
        }
        else {
            Integer num;
            while(true){
                num=generator.getNext();
                if(num==null) return null;
                if(filter.accept(num)) return num;
            }
        }
    }
}
