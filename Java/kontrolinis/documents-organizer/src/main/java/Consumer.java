import lt.itakademija.Document;
import lt.itakademija.DocumentConsumer;
import lt.itakademija.FileRepository;

import java.util.List;

public class Consumer implements  DocumentConsumer {
    FileRepository fileRepository;

    public Consumer(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void consumeSpam(Document document) {
        fileRepository.putSpam(document);
    }

    public void consumeImportant(Document document) {
        fileRepository.putImportant(document);
    }

    public void consumeOrdinary(Document document) {
        fileRepository.putOrdinary(document);
    }
}
