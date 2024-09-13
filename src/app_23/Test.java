package app_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/mysql","root","8576");
        Statement st=con.createStatement();
        int rowCount2=st.executeUpdate("create table empl(eno int)");
        System.out.println(rowCount2);
        int rowCount3=st.executeUpdate("drop table empl");
        System.out.println(rowCount3);
        
	}

}
