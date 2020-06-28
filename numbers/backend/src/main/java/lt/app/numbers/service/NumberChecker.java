package lt.app.numbers.service;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Number checker class.
 * Checks how many steps need for win.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

@Getter
@Setter
public class NumberChecker {
    private int count=Integer.MAX_VALUE;
    private Boolean winnable;

    private void replaceCount(int count){
        if(count<this.count){
            this.count=count;
        }
    }

    public Boolean check(List<Integer> array, int count){
        int insideCount=count;
        for (int i = 0; i < array.size(); i+=array.get(i) ) {
            if(i == array.size() - 1){
                replaceCount(insideCount);
                setWinnable(true);
                return true;
            }
            insideCount++;
            if(array.get(i)>1){
                for (int j = 1; j <= array.get(i); j++) {
                    insideCount++;
                    List<Integer> newArray = new ArrayList<Integer>(array.subList(j,array.size()));
                    Boolean check=check(newArray,insideCount);
                    if(check){
                        replaceCount(insideCount);
                        setWinnable(true);
                        return true;
                    }
                }
            }
            if(array.get(i)<=0){
                return false;
            }
        }
        return false;
    }

}
