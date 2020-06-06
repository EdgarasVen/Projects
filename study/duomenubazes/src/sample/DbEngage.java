package sample;



import java.sql.*;

public class DbEngage {

    Connection cn;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    public DbEngage() {
        try {
            Class.forName("org.h2.Driver");
            cn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", null);
            st=cn.createStatement();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAllTable()  {
        try {
            st=cn.createStatement();
            rs=st.executeQuery(
                    "SELECT * FROM TESTTABLE;"
            );
            while (rs.next()){
                System.out.println(rs.getInt("ID")+" "+rs.getString("name"));
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateThroughResultSet(){
        try {
            st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=st.executeQuery("select * from public.testtable");
            while (rs.next()){
                System.out.println(rs.getString("name"));
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void preparedQuery(){
        try {
            pst=cn.prepareStatement("SELECT * FROM TESTTABLE WHERE NAME = ?");
            pst.setString(1, "NICE NAME");
            rs=pst.executeQuery();
            while (rs.next()) {
                System.out.println("name: "+ rs.getString("name"));
            }
        pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}
}
