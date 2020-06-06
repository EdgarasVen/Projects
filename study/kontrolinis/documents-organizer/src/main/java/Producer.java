import lt.itakademija.Document;
import lt.itakademija.DocumentProducer;

import java.util.Iterator;

public class Producer implements  DocumentProducer {
    Iterator<Document> iterator;

    public Producer(Iterator<Document> iterator) {
        this.iterator = iterator;
    }

    public Document get() {
        if(iterator.hasNext()){
        return iterator.next();
        }
        else return null;
    }
}
