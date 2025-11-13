/******************************************************************************
3. Reverse an array
*******************************************************************************/

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={12,13,14,16,18,45};
		
		
//      method 1:-
		int [] rev= new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
		    rev[i]=arr[arr.length-1-i];
		}
		
		System.out.println("reversed array:"+Arrays.toString(rev));
		
		
// 		method 2:-
        for (int n = 0; n < (arr.length / 2); n++) {
            int temp = arr[n];
            arr[n] = arr[arr.length - 1 - n];
            arr[arr.length - 1 - n] = temp;
        }

        System.out.println("reversed array:"+Arrays.toString(arr));
	}
}
