import java.sql.*;

public class jdbc {
	public static void main(String args[]){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@host:1521:database","system","12345");
	Statement stmt=con.createStatement();
	String query="select * from student";
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next())
	{
		System.out.println(rs.getInt("SIID")+"  ");
		System.out.println(rs.getString("SNAME"));
	}
	}
	catch(Exception r)
	{
		System.out.println("error");
		
	}
}}
