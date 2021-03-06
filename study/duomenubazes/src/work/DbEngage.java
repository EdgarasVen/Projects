package work;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbEngage {
    Connection cn;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    static final String NAME = "sa";
    static final String PASS = null;
    static final String DRIVER = "org.h2.Driver";
    static final String URL = "jdbc:h2:tcp://localhost/~/test";

    public DbEngage() {
        try {
            Class.forName(DRIVER);
            cn= DriverManager.getConnection(URL, NAME, PASS);
            st=cn.createStatement();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("error in connection");
        }
    }

    public void printNamesAndSurname(){
        try {
            st=cn.createStatement();
            rs=st.executeQuery(
                    "SELECT NR,PAVARDE FROM VYKDYTOJAI"
            );
            while (rs.next()){
                System.out.println(rs.getInt("NR")+" "+rs.getString("PAVARDE"));
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error in printNamesAndSurname");
        }
    }
    public void printCompanyAndEmployeesWithTwo(){
        try {
            ArrayList<String> list = new ArrayList<>();
            st=cn.createStatement();
            rs=st.executeQuery(
                    "SELECT PAVADINIMAS FROM PROJEKTAI ;"
            );
            while (rs.next()){
                list.add(rs.getString("PAVADINIMAS"));
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println("= "+list.get(i)+" =");
                rs=st.executeQuery(
                        "SELECT A.PAVARDE \n" +
                                "FROM VYKDYTOJAI AS A\n" +
                                "JOIN VYKDYMAS AS B \n" +
                                "JOIN  PROJEKTAI AS C\n" +
                                "ON A.NR = B.VYKDYTOJAS AND C.NR =B.PROJEKTAS \n" +
                                "WHERE C.PAVADINIMAS ='"+list.get(i)+"';"
                );
                while (rs.next()){
                    System.out.println(rs.getString("PAVARDE"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error in printCompanyAndEmployees");
        }
    }
    public void printCompanyAndEmployeesWithOne()  {
        try {
            String projectName="";
            st=cn.createStatement();
            rs=st.executeQuery("SELECT C.PAVADINIMAS,\n" +
                    "A.PAVARDE \n" +
                    "FROM VYKDYTOJAI AS A\n" +
                    "JOIN VYKDYMAS AS B \n" +
                    "JOIN  PROJEKTAI AS C\n" +
                    "ON A.NR = B.VYKDYTOJAS \n" +
                    "AND C.NR =B.PROJEKTAS \n" +
                    "GROUP BY C.PAVADINIMAS,A.PAVARDE;");
            while (rs.next()){
                if (!projectName.equals(rs.getString("PAVADINIMAS"))){
                    projectName =rs.getString("PAVADINIMAS");
                    System.out.println(" = "+projectName+" = ");
                }
                System.out.println(rs.getString("PAVARDE"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error in printCompanyAndEmployees");
        }
    }
    public void addNewEmployee(String surname,String qualification ,int category,String education){
        try {
            pst=cn.prepareStatement("INSERT INTO VYKDYTOJAI \n" +
                    "VALUES((SELECT MAX(NR)+1 FROM VYKDYTOJAI ),\n" +
                    "?,?,?,?);");
            pst.setString(1, surname);
            pst.setString(2, qualification);
            pst.setInt(3, category);
            pst.setString(4, education);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error in addNewEmployee");
        }
    }
    public void updateEmployeeProject(int employeeNr, String projectName, int hours){
        try {
            String employeeQualification = null;
            int projectNr=0;
            pst=cn.prepareStatement("SELECT KVALIFIKACIJA  FROM VYKDYTOJAI WHERE NR=?;"
                    );
            pst.setInt(1, employeeNr);
            rs=pst.executeQuery();
            while (rs.next()){
                employeeQualification = rs.getString("KVALIFIKACIJA");
            }
            pst=cn.prepareStatement("SELECT NR  FROM PROJEKTAI \n" +
                    "WHERE PAVADINIMAS =?;");
            pst.setString(1, projectName);
            rs=pst.executeQuery();
            while (rs.next()){
                projectNr = rs.getInt("NR");
            }
            pst=cn.prepareStatement(
                    "INSERT INTO VYKDYMAS \n" +
                            "VALUES ("+projectNr+","+employeeNr+",'"+employeeQualification+"',?);"
            );
            pst.setInt(1,hours);
            pst.executeUpdate();
            pst.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error in updateEmployeeProject");
        }
    }
    public void showAllTables(){
        try {
            String tableName="";
            st=cn.createStatement();
            rs=st.executeQuery("SELECT *\n" +
                    "FROM INFORMATION_SCHEMA.COLUMNS \n" +
                    "WHERE TABLE_SCHEMA ='PUBLIC';");
            while (rs.next()){
                if (!tableName.equals(rs.getString("TABLE_NAME"))){
                   tableName=rs.getString("TABLE_NAME");
                    System.out.println(" = "+tableName+" = ");
                }
                System.out.print(rs.getString("COLUMN_NAME")+" TYPE: ");
                System.out.println(rs.getString("COLUMN_TYPE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
