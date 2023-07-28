import java.sql.*;
public class UserDetails {
	public void getValues(GetSetUser obj)throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		String Query="insert into UserDetails(Name,Email,PhoneNumber,Age,Password) values(?,?,?,?,?)";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.setString(1,obj.getName());
		st.setString(2, obj.getEmail());
		st.setString(3, obj.getPhoneNumber());
		st.setInt(4, obj.getAge());
		st.setString(5,obj.getPassword());
		st.executeUpdate();
		System.out.println("Create values");
	}
	public void getUpdate(GetSetUser obj)throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		String Query="update UserDetails set Name=? where Id=?";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement st =con.prepareStatement(Query);
		st.setString(1,obj.getName());
		st.setInt(2, 1);
		st.executeUpdate();
		System.out.println("Update values");
		}
	public void getDelete()throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		int Id=1;
		String Query="delete from UserDetails  where id="+Id;
		
		Connection con=DriverManager.getConnection(url,username,password);		
		Statement st =con.createStatement();
		st.executeUpdate(Query);
		st.close();
		System.out.println("Delete values");
		
		}
	public void getDeleteAll()throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		
		String Query="DROP table UserDetails";
		
		Connection con=DriverManager.getConnection(url,username,password);		
		PreparedStatement st =con.prepareStatement(Query);
		st.executeUpdate();
		System.out.println("DeleteAll values");
		}
	public void getSelect()throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		int Id=1;
		String Query="Select  *from UserDetails where Id="+Id;
		
		Connection con=DriverManager.getConnection(url,username,password);		
		Statement st =con.createStatement();
		System.out.println("Select values");
		ResultSet rs =st.executeQuery(Query);
		while(rs.next()) {
			System.out.print("Id "+rs.getInt(1));
			System.out.print("Name "+rs.getString(2));
			System.out.print("Email "+rs.getString(3));
			System.out.print("Age "+rs.getInt(4));
			System.out.print("Phone "+rs.getString(5));
			System.out.print("Password "+rs.getString(6));
		}
		}
	public void getSelectAll()throws Exception
	{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
		String username="root";
		String password="0901";
		String Query="SELECT * FROM UserDetails ";
		
		Connection con=DriverManager.getConnection(url,username,password);		
		Statement st=(Statement)con.createStatement();
		System.out.println("SelectAll values");
		ResultSet rs =st.executeQuery(Query);
		while(rs.next()) {
			System.out.print("Id "+rs.getInt(1));
			System.out.print("Name "+rs.getString(2));
			System.out.print("Email "+rs.getString(3));
			System.out.print("Age "+rs.getInt(4));
			System.out.print("Phone "+rs.getString(5));
			System.out.print("Password "+rs.getString(6));
		}
		}
}
