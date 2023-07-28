import java.sql.*;
public class Create_Table {
public void getTable() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
	String username="root";
	String password="0901";
	
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	String sql="create table UserDetails "
			+ "(Id INTEGER not NULL PRIMARY KEY AUTO_INCREMENT,"
			+ "Name VARCHAR(255) not NULL,"
			+ "Email VARCHAR(255) not NULL,"
			+ "PhoneNumber VARCHAR(255) not NULL UNIQUE,"
			+ "Age INTEGER not NULL,"
			+ "Password VARCHAR(255) not NULL)";
	st.execute(sql);
	System.out.println("CREATE TABLE");
}
public void getTable1() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
	String username="root";
	String password="0901";
	
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	String sql="create table FlightDetails  "
			+ "(Id INTEGER not NULL PRIMARY KEY AUTO_INCREMENT,"
			+ "FlightName VARCHAR(255) not NULL,"
			+ "FlightNumber VARCHAR(255) not NULL,"
			+ "Dom_Inter VARCHAR(255) not NULL UNIQUE,"
			+ "Time VARCHAR(255) not NULL)";
	st.execute(sql);
	System.out.println("CREATE TABLE");
}

}
