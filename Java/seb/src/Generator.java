import java.math.BigInteger;
import java.util.ArrayList;

public class Generator {
    public ArrayList generate(Parameters p){
        int count=0;
        ArrayList list=new ArrayList<>();
        BigInteger result;
        BigInteger startingNumber=p.startingNumber;
        while(count<p.listRange){
            result=startingNumber.multiply(p.multiplierFactor);
            startingNumber=result.remainder(p.remainder);
            list.add(startingNumber.intValue());
            count++;
        }
      return list;
    }
}
