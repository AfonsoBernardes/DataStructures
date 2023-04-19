import java.util.ArrayList;
import java.util.Scanner;

public class TreeHeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  numOfNodes = sc.nextInt();
		
		int[] inputArray = new int[numOfNodes];
		ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
		
		for(int idx = 0; idx < numOfNodes; idx++) {
			
			inputArray[idx] = sc.nextInt();
			tree.add(new ArrayList<Integer>()); // Initialise tree with empty ArrayLists
		}
		
		
		for(int idx = 0; idx < numOfNodes; idx++) {
			int value = inputArray[idx];

 			if(value != -1) {
 			// For each value in input array, store its position "idx" in tree.
				tree.get(value).add(idx);
			}
		}
		
		sc.close();
		
		int treeHeight = 1; // Start at one because "-1" is not accounted for in tree.
		
		ArrayList<Integer> currentIndex = new ArrayList<Integer>();
		ArrayList<Integer> tempIndex = new ArrayList<Integer>();
		currentIndex.add(findRoot(inputArray));
		
		while(true) {
			
			for(int index : currentIndex) {
				tempIndex.addAll(tree.get(index)); // For each tree level, find children for every current node.
			}
			currentIndex = tempIndex;
			tempIndex = new ArrayList<Integer>();
			
			if(currentIndex.isEmpty()) {
				break;
			}
			
			treeHeight++;
		}	
		System.out.println(treeHeight);
	}
	
	public static int findRoot(int[] array) {
		
		int idx = 0;
		while (true) {
			if(array[idx] == -1) {
				return idx;
			}
			idx++;
		} 
	}
}	