import java.util.ArrayList;
import java.util.Scanner;

public class HashingWithChains {

	public static void main(String[] args) {
		
		final long p = 1000000007;
		final long x = 263;
		
		Scanner sc = new Scanner(System.in);
		
		long numBuckets = sc.nextLong();
		ArrayList<String>[] buckets = new ArrayList[(int) numBuckets];
		
		for(int idx = 0; idx < numBuckets; idx++) {
			buckets[idx] = new ArrayList<String>();
		}
		
		long numQueries = sc.nextInt();
		
		String query;
		long hashCode;
		
			
		for(int action = 0; action < numQueries; action++) {
			
			query = sc.next();
			
			if(query.equals("add")) {
				String str = sc.next();
				hashCode = hashCode(str, x, p, numBuckets);
				
				if(!buckets[(int) hashCode].contains(str)) {
					buckets[(int) hashCode].add(0, str);
				}
			}
			
			
			else if(query.equals("del")) {
				String str = sc.next();
				hashCode = hashCode(str, x, p, numBuckets);
				
				if(buckets[(int) hashCode].contains(str)) {
					buckets[(int) hashCode].remove(str);
				}
			}
			
			
			else if(query.equals("find")) {
				String str = sc.next();
				hashCode = hashCode(str, x, p, numBuckets);
				
				if(buckets[(int) hashCode].contains(str)) {
					System.out.println("yes");
				}
				
				else {
					System.out.println("no");;
				}
			}
			
			
			else if(query.equals("check")) {
				long bucket = sc.nextInt();
				String result = "";
				
				if(buckets[(int) bucket].isEmpty()) {
					System.out.print("\n");
				}
				
				else {
					for(int idx = 0; idx < buckets[(int) bucket].size(); idx++) {
						
						if(idx == buckets[(int) bucket].size() - 1) {
							result += buckets[(int) bucket].get(idx);
						}
						
						else {
							result += buckets[(int) bucket].get(idx) + " ";
						}
					}
					System.out.println(result);
				}
	
			}
	}
		sc.close();
}
	
	
	public static long hashCode(String str, long x, long p, long numBuckets) {
		
		long hashCode = 0;
		
		for (int i = str.length() - 1; i >= 0; --i) {
            hashCode = (hashCode * x + str.charAt(i)) % p;
    	}
		return (int)hashCode % numBuckets;
	}
}