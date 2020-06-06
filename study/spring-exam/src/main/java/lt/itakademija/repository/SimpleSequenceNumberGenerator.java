package lt.itakademija.repository;

import org.springframework.stereotype.Service;

@Service
public final class SimpleSequenceNumberGenerator implements SequenceNumberGenerator {

    private Long num=1L;

    @Override
    public Long getNext() {
        return num++;
    }

}
