import java.util.ArrayList;

public class Comparator {
    public int compareByLastBinaryDigits (ArrayList provider1,ArrayList provider2,int lastBitsMatch){
        int count=0;
        for (int i = 0; i < provider1.size(); i++) {
            if( Integer.toBinaryString((Integer) provider1.get(i)).length()>=lastBitsMatch )
            if(Integer.toBinaryString(
                    (Integer) provider1.get(i))
                    .substring(Integer.toBinaryString((Integer) provider1.get(i)).length()-lastBitsMatch)
                    .equals(Integer.toBinaryString(
                            (Integer) provider2.get(i))
                            .substring(Integer.toBinaryString((Integer) provider2.get(i)).length()-lastBitsMatch)))
                count++;
        }
        return count;
    }
}
