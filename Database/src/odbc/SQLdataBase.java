package odbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLdataBase {

private Connection con;
private Statement st;
private static final String url="jdbc:odbc://xxx.xxx.xxx.xxx:3306";
private static final String className="sun.jdbc.odbc.JdbcOdbcDriver";

    private static  String user;
    private static  String pass;

 SQLdataBase(String userName, String password) {
           user=userName;
        pass=password;
    try {
            Class.forName(className);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("success");
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex);
        }
  //do whatever database processing is required
 }

 
    public void queryNoReturn(String query) throws SQLException{
        st.executeQuery(query);
    }

 }