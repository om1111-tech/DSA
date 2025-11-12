/******************************************************************************
1. Find the Second Largest Element in an Array
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={10,12,13,14,17,39};
		
		int max=arr[0];
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++){
		    if(arr[i]>max){
		        secondMax=max;
		        max=arr[i];
		    }
		}
		System.out.println(max);
		System.out.println(secondMax);
		
	}
}
