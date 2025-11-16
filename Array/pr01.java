/******************************************************************************
1. Find the Largest Element in an Array
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={10,12,13,14,17,39};
		
		int max=arr[0];
		
		//method 1:-
		for(int m: arr){
		    if(m>max){
		        max=m;
		    }
		}
		
		System.out.println(max);
		
		
		//method 2:-
		for (int i=1;i<arr.length;i++){
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		System.out.println(max);
	}
}
