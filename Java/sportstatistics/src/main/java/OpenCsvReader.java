import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvReader implements CsvReader{
    private String file;

    public OpenCsvReader(String file) {
        File f = new File(file);
        if(f.exists() && !f.isDirectory()) {
            this.file = file;
        }
    }

    @Override
    public List<Round> read() {
        try
        {
            CSVReader reader = new CSVReader(new FileReader(file));
            List<Round> rounds = new ArrayList<Round>();
            String[] record = null;
            while ((record = reader.readNext()) != null) {
                rounds.add(new Round(record[0], record[1], record[2], record[3]));
            }
            reader.close();
            return rounds;
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getFileName() {
        return file;
    }
}
