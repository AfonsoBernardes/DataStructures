import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stack {
	
	ArrayList<Integer> list;
	int maximum;
	
	public Stack() {
		this.list = new ArrayList<Integer>();
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numQueries = sc.nextInt();
		String[] queries = new String[numQueries];
		
		Stack stack = new Stack();
		
		for(int idx = 0; idx < numQueries; idx++) {
			queries[idx] = sc.next(); // Read next "task".
		
			if(queries[idx].startsWith("push")) {	
				int value = sc.nextInt(); // If next task is to push, an integer comes as input next.				
				stack.push(value);
				
				if(value > stack.maximum) {
					stack.maximum = value;
				}
			}
			
			else if (queries[idx].equals("pop")) {
				int popped = stack.pop();
				
				if(popped == stack.maximum) {
					stack.findMaximum();
				}
			}
			
			else if (queries[idx].equals("max")) {
				System.out.println(stack.maximum); // Whenever "max()" is called, store returned value.
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
	
	public void findMaximum(){
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> tempArrayList = (ArrayList<Integer>) this.list.clone();
		
		Collections.sort(tempArrayList);
		this.maximum = tempArrayList.get(this.list.size()-1);
	}
}
