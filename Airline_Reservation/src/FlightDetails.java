import java.sql.*;
public class FlightDetails {
	
		public void getDetails(GetSetFlight obj)throws Exception{
			String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
			String username="root";
			String password="0901";
			String Query="insert into FlightDetails(FlightName,FlightNumber,Dom_Inter,Time) values(?,?,?,?)";
			
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(Query);
			st.setString(1,obj.getFlightName());
			st.setString(2,obj.getFlightNumber());
			st.setString(3,obj.getDom_Inter());
			st.setString(4,obj.getTime());
			st.executeUpdate();
			System.out.println("Create values");
		}
		public void getUpdate(GetSetFlight vjs)throws Exception
		{
			String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
			String username="root";
			String password="0901";
			String Query="update FlightDetails set Name=? where Id=?";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement st =con.prepareStatement(Query);
			st.setString(1,vjs.getFlightName());
			st.setInt(2, 1);
			st.executeUpdate();
			System.out.println("Update  values");
			}
		public void getDelete()throws Exception
		{
			String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
			String username="root";
			String password="0901";
			int Id=1;
			String Query="delete from FlightDetails   where id="+Id;
			
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
			
			String Query="DROP table FlightDetails";
			
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
			String Query="Select  *from FlightDetails where Id="+Id;
			
			Connection con=DriverManager.getConnection(url,username,password);		
			Statement st =con.createStatement();
			System.out.println("Select values");
			ResultSet rs =st.executeQuery(Query);
			while(rs.next()) {
				System.out.print("Id "+rs.getInt(1));
				System.out.print("FlightName "+rs.getString(2));
				System.out.print("FlightNumber"+rs.getString(3));
				System.out.print("Dom_Inter"+rs.getString(4));
				System.out.print("Time"+rs.getString(5));
			}
			}
		public void getSelectAll()throws Exception
		{
			String url="jdbc:mysql://127.0.0.1:3306/Airline_Reservation";
			String username="root";
			String password="0901";
			String Query="SELECT * FROM FlightDetails ";
			
			Connection con=DriverManager.getConnection(url,username,password);		
			Statement st=(Statement)con.createStatement();
			System.out.println("SelectAll values");
			ResultSet rs =st.executeQuery(Query);
			while(rs.next()) {
				System.out.print("Id "+rs.getInt(1));
				System.out.print("FlightName "+rs.getString(2));
				System.out.print("FlightNumber "+rs.getString(3));
				System.out.print("Dom_Inter "+rs.getString(4));
				System.out.print("Time"+rs.getString(5));
			}
			}

}
