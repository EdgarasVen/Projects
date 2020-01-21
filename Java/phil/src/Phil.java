
import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Phil implements Philatelist {
    private Set<PostStamp> list=new HashSet<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp==null || postStamp.getName()==null || postStamp.getName().isEmpty() )
            throw new IllegalArgumentException();
        else
            list.add(postStamp);
    }
    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        return list.stream()
                .max(Comparator.comparing(PostStamp::getMarketPrice))
                .orElse(null);
    }
    @Override
    public double getAveragePostStampPrice() {
        return list.stream()
                .mapToDouble(PostStamp::getMarketPrice)
                .average().orElse(0.0);
    }
    @Override
    public int getNumberOfPostStampsInCollection() {
        return list.size();
    }
}
