public class Storage {
    final double storageLimit;
    private double unit;

    public Storage(double storageLimit) {
        this.storageLimit = storageLimit;
    }

    public void use(double unit) {
        if (this.unit-unit<0)
            throw new IllegalArgumentException("Not enough in storage or empty");
        this.unit-=unit;
    }

    public void fill(double unit) {
        if(this.unit + unit>storageLimit)
            throw new IllegalArgumentException("Too much to fill or storage full");
        this.unit += unit;
    }
}
