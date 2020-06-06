package dbfromtxtfile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        List<String> list = new ArrayList<>();
        FileReader reader = new FileReader();
        list = reader.readFromFile("projects.txt");
        System.out.println(list);
        System.out.println("-------------------");

        DbEngage db = new DbEngage();
        db.insetNewProjectFromFile("projects.txt");
    }
}
