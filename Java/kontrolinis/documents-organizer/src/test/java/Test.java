import lt.itakademija.*;

import java.util.Iterator;

public class Test extends BaseTest {

    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return new Organizer(documentTypeDetector);
    }

    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        return new Producer(iterator);
    }

    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return new Consumer(fileRepository);
    }
}
