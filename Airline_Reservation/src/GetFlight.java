import java.util.Scanner;
public class GetFlight {
	public static void main(String[]args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		switch(n) {
		case 1:
			for(int i=0;i<=s;i++) {
			System.out.println("1.Create value");
			System.out.println("FlightName");
			String  FlightName=sc.next();
			System.out.println("FlightNumber");
			String FlightNumber=sc.next();
			System.out.println("Dom_Inter");
			String Dom_Inter=sc.next();
			System.out.println("Time");
			String Time=sc.next();
			
			GetSetFlight ob=new GetSetFlight();
			ob.setFlightName(FlightName);
			ob.setFlightNumber(FlightNumber);
			ob.setDom_Inter(Dom_Inter);
			ob.setTime(Time);
			FlightDetails udv=new FlightDetails();
			udv.getDetails(ob);
			}
			break;
		case 2:
			System.out.println("2.Update value");
			System.out.println("FlightName");
			String setFlightName=sc.next();
			GetSetFlight gsu=new GetSetFlight();
			gsu.setFlightName(setFlightName);
			FlightDetails us=new FlightDetails();
			us.getUpdate(gsu);
			break;
		case 3:
			System.out.println("3.Delete value");
			FlightDetails udd=new FlightDetails();
			udd.getDelete();
			break;
		case 4:
			System.out.println("4.DeleteAll value");
			FlightDetails udda=new FlightDetails();
			udda.getDeleteAll();
			break;
		case 5:
			System.out.println("5.Select value");
			FlightDetails uds=new FlightDetails();
			uds.getSelect();
			break;
		case 6:
			System.out.println("6.SelectAll value");
			FlightDetails udsa=new FlightDetails();
			udsa.getSelectAll();
			break;
		}	
	}
}
