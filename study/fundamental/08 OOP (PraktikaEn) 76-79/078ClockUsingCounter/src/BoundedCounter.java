import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
// write code here
        this.upperLimit = upperLimit;
    }
    public void next() {
// write code here
        if (value>=upperLimit)
            value=0;
        else
           value++;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String output = String.format("%02d",value);
        return output ;
    }
}
