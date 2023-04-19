import java.util.ArrayList;
import java.util.Scanner;

public class IsBinarySearchTree {

	public static void main(String[] args) {
		// Vertex class already defined in its own class

		Scanner sc = new Scanner(System.in);
		
		long numOfVertices = sc.nextLong();
		long key, left, right;
		Vertex2[] tree = new Vertex2[(int) numOfVertices]; // Create array to hold vertices.
		
		for(int vertex = 0; vertex < numOfVertices; vertex ++) {
			
			key = sc.nextLong(); // Actual vertex key
			left = sc.nextLong(); // Index of left child in tree
			right = sc.nextLong(); // Index of right child in tree
			
			tree[vertex] = new Vertex2(key, left, right);
		}
		sc.close();
		if(numOfVertices == 0) {
			System.out.println("CORRECT");
			return;
		}
		
		ArrayList<String> result = new ArrayList<String>();
		if(CheckBST(tree, 0, (long) Double.NEGATIVE_INFINITY, (long) Double.POSITIVE_INFINITY, result).contains("INCORRECT")) {
			System.out.println("INCORRECT");
		}
		else {System.out.println("CORRECT");}
	}
	
	public static ArrayList<String> CheckBST(Vertex2[] tree, long currentVertex, long min, long max, ArrayList<String> result) {
		
		if(currentVertex == -1) {
			return result;
		}
		
		long currentKey = tree[(int) currentVertex].key;
		long rightIndex = tree[(int) currentVertex].right;
		long leftIndex = tree[(int) currentVertex].left;
		
		if(leftIndex == -1) {
			CheckBST(tree, leftIndex, min, max, result);
		}
		
		else {
			//leftKey = tree[leftIndex].key;
			CheckBST(tree, leftIndex, min, currentKey, result);
		}
		
		
		if(rightIndex == -1) {
			CheckBST(tree, rightIndex, min, max, result);
		}
		
		else {
			//rightKey = tree[rightIndex].key;
			CheckBST(tree, rightIndex, currentKey, max, result);
		}		
		
		if (currentKey >= max || currentKey <= min) {
			result.add("INCORRECT");
			return result;
		}
		
		else {
			result.add("CORRECT");
			return result;
		}
	}
}

class Vertex2 {
	long key;
	long left;
	long right;
	
	public Vertex2(long key, long left, long right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
}
