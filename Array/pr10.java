/******************************************************************************
10. Kadane’s Algorithm (Maximum Subarray Sum)
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={-1,2,3,4,5,-5,7,6};
		
		int currentSum=0;
		
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
		    currentSum+=arr[i];
		    
		    if(currentSum>maxSum){
		        maxSum=currentSum;
		    }
		    
		    if(currentSum<0){
		        currentSum=0;
		    }
		    
		    
		}
		System.out.println("Maximum Subarray Sum = " + maxSum);
	}
}
