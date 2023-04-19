import java.util.Hashtable;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int numQueries = sc.nextInt();
		Hashtable<String, String> phoneBook = new Hashtable<String, String>(); //Key = Number, Value = Name.
		
		String phoneNumber;
		String name;
		
		for(int action = 0; action < numQueries; action++) {

			String query = sc.next();
			
			if(query.equals("add")) {
				phoneNumber = sc.next();
				name = sc.next();
				phoneBook.put(phoneNumber, name);
			}
			
			else if(query.equals("del")) {
				phoneNumber = sc.next();
				if(phoneBook.containsKey(phoneNumber)){
					phoneBook.remove(phoneNumber);
				}
			}
			
			else if(query.equals("find")) {
				
				phoneNumber = sc.next();
				if(phoneBook.containsKey(phoneNumber)){
					System.out.println(phoneBook.get(phoneNumber));
				}
				
				else {
					System.out.println("not found");
				}
			}
		}
		sc.close();
	}
}
