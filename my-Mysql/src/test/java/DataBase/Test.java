package DataBase;
import java.sql.SQLException;

import DataBase.SQLdataBase;
public class Test {
	static String username="root";
	static String password="Andrey.,13";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		SQLdataBase run = new SQLdataBase(username, password);
		
	}

	
}
