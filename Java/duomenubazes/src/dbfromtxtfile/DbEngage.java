package dbfromtxtfile;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DbEngage {
    Connection cn;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;


    public DbEngage() {
        dataBaseConnection();
    }
    private void dataBaseConnection(){
        try {
            Class.forName("org.h2.Driver");
            cn= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", null);
            st=cn.createStatement();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void insetNewProjectFromFile(String fileName) throws SQLException {
        try {
            FileReader reader = new FileReader();
            List<String> list =new ArrayList<>();
            list= reader.readFromFile(fileName);
            if(list==null){
                System.out.println("In file some projects repeat or empty");
                return;
            }
            cn.setAutoCommit(false);
            pst=cn.prepareStatement(
                    "INSERT INTO PROJEKTAI \n" +
                            "VALUES\n" +
                            "((SELECT MAX(NR)+1 FROM PROJEKTAI), ?, '?',DATE '2005-01-01', 1);");
            for (String st: list
                 ) {
                pst.setString(1, st);
                pst.executeUpdate();
            }
            pst.close();
            cn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            cn.rollback();
        }finally {
            cn.setAutoCommit(true);
        }
    }
}
