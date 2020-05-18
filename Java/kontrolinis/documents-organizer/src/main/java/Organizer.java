import lt.itakademija.*;

import java.util.List;

public class Organizer implements  DocumentOrganizer {
    DocumentTypeDetector detector;
    private int count=0;
    private int lineCount=0;

    public Organizer(DocumentTypeDetector detector) {
        this.detector = detector;
    }

    public long getTotalCount() {
        return count;
    }

    public long getTotalLinesCount() {
        return lineCount;
    }

    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {
        if(documentConsumer==null)throw new IllegalArgumentException();
        if(documentProducer==null)throw new IllegalArgumentException();
        while (documentProducer.get()!=null){
            Document document= documentProducer.get();
            if (document!=null){
                System.out.println(detector.detect(document));
                lineCount+=document.getLines().size();
                if (detector.detect(document)==DocumentType.IMPORTANT) {
                    documentConsumer.consumeImportant(document);
                    count++;
                }
                if (detector.detect(document)==DocumentType.ORDINARY){
                    documentConsumer.consumeOrdinary(document);
                    count++;
                }
                if (detector.detect(document)==DocumentType.SPAM){
                    documentConsumer.consumeSpam(document);
                    count++;
                }
                if (detector.detect(document)==DocumentType.UNKNOWN){
                    count++;
                    throw new UnknownDocumentTypeException(document.getTitle());

                }
        }
        }
    }
}
