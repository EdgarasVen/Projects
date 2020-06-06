import java.math.BigInteger;

class Parameters {
    BigInteger startingNumber;
    BigInteger multiplierFactor;
    BigInteger remainder;
    int listRange;

    public Parameters(String startingNumber, String multiplierFactor, String remainder,int listRange) {
        this.startingNumber = new BigInteger(startingNumber);
        this.multiplierFactor = new BigInteger(multiplierFactor);
        this.remainder = new BigInteger(remainder);
        this.listRange=listRange;
    }
}
