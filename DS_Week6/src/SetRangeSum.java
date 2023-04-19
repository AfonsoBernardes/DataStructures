import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetRangeSum {

	public static void main(String[] args) {
		
		Set<Long> set = new HashSet<Long>();
		long sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		long numOperations = sc.nextInt();
		long i = 0;
		long M = 1_000_000_001;
		
		for (int operation = 0; operation < numOperations; operation++) {
			
			String query = sc.next();
			
			if (query.equals("+")) {
				i = sc.nextInt();
				set.add((i+sum) % M);
			}
			
			if (query.equals("-")) {
				i = sc.nextInt();
				set.remove((i+sum) % M);
			}
			
			if (query.equals("?")) {
				i = sc.nextInt();
				if(set.contains((i+sum) % M)) {System.out.println("Found");}
				else {System.out.println("Not found");}
			}
			
			if (query.equals("s")) {
				long l = sc.nextInt();
				long r = sc.nextInt();
			
				long setSum = 0;
				for(long value : set) {
					if((l+sum) % M <= value && value <= ((r+sum)%M)){
						setSum += value;
					}
				}
				System.out.println(setSum);
				sum = setSum;
			}
		}
		
		sc.close();
	}
}
