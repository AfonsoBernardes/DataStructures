import java.util.ArrayList;
import java.util.Scanner;

public class ConvertArrayToHeap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numOfInputs = sc.nextInt();
		int[] heapArray = new int[numOfInputs];
		ArrayList<String> swaps = new ArrayList<String>();
		
		for(int idx = 0; idx < numOfInputs; idx++) {
			heapArray[idx] = sc.nextInt();
		}
		sc.close();
		
		int swapCounter = 0;
		
		for(int idx = numOfInputs/2; idx >= 0; idx--) {
			swapCounter = SiftDown(heapArray, idx, swapCounter, swaps);
		}
		
		System.out.println(swapCounter);
		
		for(String str : swaps) {
			System.out.println(str);
		}	
		
	}
	
	public static int SiftDown(int[] heapArray, int index, int swapCounter, ArrayList<String> swaps) {
		
		int maxIndex = index;
		
		int left = LeftChild(index);
		if(left < heapArray.length && heapArray[left] < heapArray[maxIndex]) {
			maxIndex = left;
		}
		
		int right = RightChild(index);
		if(right < heapArray.length && heapArray[right] < heapArray[maxIndex]) {
			maxIndex = right;
		}
		
		if(index != maxIndex) {
			
			swaps.add(index + " " + maxIndex); // Store swapped index.
			
			int temp = heapArray[index];
			heapArray[index] = heapArray[maxIndex];
			heapArray[maxIndex] = temp;
			
			swapCounter++; // Increase swap counter after swap.
			
			swapCounter = SiftDown(heapArray, maxIndex, swapCounter, swaps);
		}
		return swapCounter;
	}
	
	public static int Parent(int i) {
		return i/2; // Floor division between integers
	}
	
	public static int LeftChild(int i) {
		return 2*i + 1; // Zero-based index in array.
	}
	
	public static int RightChild(int i) {
		return 2*i + 2;
	}
}
