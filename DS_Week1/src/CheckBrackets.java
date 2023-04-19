import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			String inputString = sc.next();
		sc.close();
		
		
		Stack<Character> bracketStack = new Stack<Character>();
		Stack<Integer> indexStack = new Stack<Integer>(); // To track unmathed chars index.
		
		for(int idx = 0; idx < inputString.length(); idx++) {
			
			char currentChar = inputString.charAt(idx);
			if(isOpeningBracket(currentChar)){
				bracketStack.push(currentChar);
				indexStack.push(idx);
			}
			
			else if(isClosingBracket(currentChar)) {
				
				// If we find closing bracket with an empty stack, there is no opening bracket for sure.
				if (bracketStack.isEmpty()) {
					System.out.println(idx + 1);
					return; 
				}
				
				else{
					
					/*
					 * There is a closing bracket, so, we need to see if it matches the last entered bracket,
					 * otherwise, it is not matched.
					 */
					char top = bracketStack.pop();
					indexStack.pop();
					
					// If they don't match, then...
					if( top == '(' && currentChar != ')' || top == '{' && currentChar != '}' || top == '[' && currentChar != ']') {
						System.out.println(idx + 1);
						return;
					}
				}
			}
		}
		
		if(bracketStack.isEmpty()) {
			System.out.println("Success");
			return;
		}
		
		else {
			System.out.println(indexStack.pop() + 1); // Failed last stacked index (0-based index).
			return;
		}
	}
	
	public static boolean isOpeningBracket(char bracket) {
		
		if(bracket == '(' || bracket == '[' || bracket == '{') {
			return true;
		}
		return false;
	}
	
	public static boolean isClosingBracket(char bracket) {
		
		if(bracket == ')' || bracket == ']' || bracket == '}') {
			return true;
		}
		return false;
	}
}
