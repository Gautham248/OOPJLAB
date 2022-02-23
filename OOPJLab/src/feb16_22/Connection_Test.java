package feb16_22;
import java.sql.*;
class Connection_Test 
{
	public static void main(String[] args)
	{
		try 
		{ 
			String username = "root";
			String password = "";
			String url ="jdbc:mysql://localhost/f_g_a" ;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			Statement stmt = conn.createStatement();
			String sql = "create table P" + "(stdid integer not null, "+"stdname varchar(50),"+ "branch varchar(50), "+"batch varchar(50),"+"age integer , "+"primary key(stdid))";
			stmt.executeUpdate(sql);
			System.out.println("Table Created.");
			System.out.println("1.Create Table\n2.Insert table values\n3.Delete table values\n4.Update table values.");

			//			ResultSet rs =stmt.executeQuery(sql);
			//			while (rs.next())
			//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
