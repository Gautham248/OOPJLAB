package feb16_22; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public abstract class Insertdb {

public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
String username = "root";
String password = "";
String url ="jdbc:mysql://localhost/delsree" ;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection(url,username,password);
System.out.println("Connection Established");
Statement stmt = conn.createStatement();
Scanner sc=new Scanner(System.in);
System.out.println("ENTER STUDENTS ID: ");
int id=sc.nextInt();
System.out.println("ENTER STUDENT NAME: ");
String name=sc.next();
System.out.println("ENTER BRANCH OF STUDENT: ");
String branch=sc.next();
System.out.println("ENTER BATCH OF STUDENT: ");
String batch=sc.next();
System.out.println("ENTER AGE OF STUDENT: ");
int age=sc.nextInt();

String strsql="INSERT INTO person(stdid,stdname,branch,batch,age)VALUES("+id+",'"+name+"','"+branch+"','"+batch+"',"+age+")";
stmt.executeUpdate(strsql);

System.out.println("THE ABOVE DATA HAS BEEN INSERTED INTO THE TABLE");
}
catch(Exception e)
{
System.out.println(e);
}
}
}