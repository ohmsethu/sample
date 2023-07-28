import java.util.Scanner;
public class GetUser {
	public static void main(String[]args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			
			System.out.println("1.Create value");
			int s=sc.nextInt();
			for(int i=1;1<=s;i++) {
			System.out.println("Name");
			String  Name=sc.next();
			System.out.println("Email");
			String Email=sc.next();
			System.out.println("PhoneNumber");
			String PhoneNumber=sc.next();
			System.out.println("Age");
			int Age=sc.nextInt();
			System.out.println("Password");
			String Password=sc.next();
			
			GetSetUser ob=new GetSetUser();
			ob.setName(Name);
			ob.setEmail(Email);
			ob.setPhoneNumber(PhoneNumber);
			ob.setAge(Age);
			ob.setPassword(Password);
			UserDetails obj=new UserDetails();
			obj.getValues(ob);
			}
			
			break;
		case 2:
			System.out.println("2.Update value");
			System.out.println("Name");
			String setName=sc.next();
			GetSetUser gsu=new GetSetUser();
			gsu.setName(setName);
			UserDetails us=new UserDetails();
			us.getUpdate(gsu);
			break;
		case 3:
			System.out.println("3.Delete value");
			UserDetails udd=new UserDetails();
			udd.getDelete();
			break;
		case 4:
			System.out.println("4.DeleteAll value");
			UserDetails udda=new UserDetails();
			udda.getDeleteAll();
			break;
		case 5:
			System.out.println("5.Select value");
			UserDetails uds=new UserDetails();
			uds.getSelect();
			break;
		case 6:
			System.out.println("6.SelectAll value");
			UserDetails udsa=new UserDetails();
			udsa.getSelectAll();
			break;
			
		}
		
		
		}

}
