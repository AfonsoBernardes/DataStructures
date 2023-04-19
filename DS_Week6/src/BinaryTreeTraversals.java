import java.util.Scanner;

public class BinaryTreeTraversals {

	public static void main(String[] args) {
		// Vertex class already defined in its own class
		
		Scanner sc = new Scanner(System.in);
		
		long numOfVertices = sc.nextLong();
		long key, left, right;
		Tree tree = new Tree((int) numOfVertices);
		
		for(int vertex = 0; vertex < numOfVertices; vertex ++) {
			
			key = sc.nextLong(); // Actual vertex key
			left = sc.nextLong(); // Index of left child in tree
			right = sc.nextLong(); // Index of right child in tree
			
			tree.add(new Vertex(key, left, right), vertex);
		}
		sc.close();
		
		
		tree.InOrderTraversal(0);
		System.out.println("");
		tree.PreOrderTraversal(0);
		System.out.println("");
		tree.PostOrderTraversal(0);
	}
}

class Vertex {
	long key;
	long left;
	long right;
	
	public Vertex(long key, long left, long right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
}

class Tree {
	
	Vertex[] tree;

	public Tree(int numOfVertices) {
		this.tree = new Vertex[numOfVertices];
	}
	
	public void add(Vertex element, int index) {
		this.tree[index] = element;
	}
	
	public void InOrderTraversal(long currentVertex) {
		
		if(currentVertex == -1) {
			return;
		}
		
		InOrderTraversal(this.tree[(int) currentVertex].left);
		System.out.print(this.tree[(int) currentVertex].key + " ");
		InOrderTraversal(this.tree[(int) currentVertex].right);
		
	}
	
	
	public void PreOrderTraversal(long currentVertex) {
			
		if(currentVertex == -1) {
			return;
		}
			
		System.out.print(this.tree[(int) currentVertex].key + " ");
		PreOrderTraversal(this.tree[(int) currentVertex].left);
		PreOrderTraversal(this.tree[(int) currentVertex].right);
	}
	
	
	public void PostOrderTraversal(long currentVertex) {
		
		if(currentVertex == -1) {
			return;
		}
		
		PostOrderTraversal(this.tree[(int) currentVertex].left);
		PostOrderTraversal(this.tree[(int) currentVertex].right);
		System.out.print(this.tree[(int) currentVertex].key + " ");
	}
	
}