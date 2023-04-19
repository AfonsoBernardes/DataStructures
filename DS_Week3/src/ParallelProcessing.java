import java.util.Scanner;

public class ParallelProcessing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			long numThreads = sc.nextInt();
			long[] finishingTimes = new long[(int) numThreads];
			
			long[] threads = new long[(int) numThreads];
			for(int thread = 0; thread < numThreads; thread++) {
				threads[thread] = thread;
			}
			
			long numJobs = sc.nextInt();
			long[] jobTime = new long[(int) numJobs];
			
			for(long job = 0; job < numJobs; job++) {
				jobTime[(int) job] = sc.nextInt();
				
			}
			
		sc.close();
		
		for(long job = 0; job < numJobs; job++) {
			
			System.out.println(threads[0] + " " + finishingTimes[0]);
			finishingTimes[0] += jobTime[(int) job];
			SiftDown(finishingTimes, threads, 0);
		}
		
	}
	
	
public static void SiftDown(long[] finishingTimes, long[] threads, long index) {
		
		long minIndex = index;
		
		long left = LeftChild((int) index);
		if(left < threads.length && finishingTimes[(int) left] < finishingTimes[(int) minIndex]) {
			minIndex = left;
		}		
		
		else if(left < threads.length && finishingTimes[(int) left] == finishingTimes[(int) minIndex]) {
			if(threads[(int) left] < threads[(int) minIndex]) {
				minIndex = left;
			}
		}
		
		long right = RightChild((int) index);
		if(right < threads.length && finishingTimes[(int) right] < finishingTimes[(int) minIndex]) {
			minIndex = right;
		}
		
		else if(right < threads.length && finishingTimes[(int) right] == finishingTimes[(int) minIndex]) {
			if(threads[(int) right] < threads[(int) minIndex]) {
				minIndex = right;
			}
		}
		
		if(index != minIndex) {
			
			long tempTime = finishingTimes[(int) index];
			finishingTimes[(int) index] = finishingTimes[(int) minIndex];
			finishingTimes[(int) minIndex] = tempTime;
			
			int tempThread = (int) threads[(int) index];
			threads[(int) index] = threads[(int) minIndex];
			threads[(int) minIndex] = tempThread;
			
			SiftDown(finishingTimes, threads, (int) minIndex);
		}
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
