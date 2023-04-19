import java.util.ArrayList;
import java.util.Scanner;

public class StackWithMax {
	
	ArrayList<Integer> list;
	int maximum;
	
	public StackWithMax() {
		this.list = new ArrayList<Integer>();
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numQueries = sc.nextInt();
		String[] queries = new String[numQueries];
		
		StackWithMax stack = new StackWithMax();
		StackWithMax maximumStack = new StackWithMax();
		
		for(int idx = 0; idx < numQueries; idx++) {
			queries[idx] = sc.next(); // Read next "task".
		
			if(queries[idx].startsWith("push")) {	
				int value = sc.nextInt(); // If next task is to push, an integer comes as input next.				
				stack.push(value); // Push value to main stack
				
				if(maximumStack.list.isEmpty() || value >= maximumStack.list.get(0)) {
					maximumStack.push(value); // If maximumStack is empty or value t be pushed is greater than current max value...
				}
			}
			
			else if (queries[idx].equals("pop")) {
				int popped = stack.pop();
				
				if(popped ==  maximumStack.list.get(0)) {
					 maximumStack.pop(); // If popped value is the current max, eliminate current max from maximumStack.
				}
			}
			
			else if (queries[idx].equals("max")) {
				System.out.println(maximumStack.list.get(0)); // Whenever "max()" is called, store returned value.
			}
		}
		sc.close();
	}
	
	
	
	public void push(int value) {
		this.list.add(0, value); // Add value to index zero.
	}
	
	public int pop() {
		int removedElement = this.list.remove(0); // Remove last inserted element.
		return removedElement;
	}
}
