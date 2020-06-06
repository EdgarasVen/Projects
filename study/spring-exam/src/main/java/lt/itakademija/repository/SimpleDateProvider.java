package lt.itakademija.repository;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SimpleDateProvider implements DateProvider {

    @Override
    public Date getCurrentDate() {
        return  new Date();
    }
}
