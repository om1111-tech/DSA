/******************************************************************************
4. Move All Zeros to the End (Method 1)
*******************************************************************************/

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={12,13,19,0,4,0,0,0,8};
		
		int count=0;
		
		for (int i=0;i<arr.length;i++){
		    if(arr[i]!=0){
		        arr[count]=arr[i];
		        count++;
		    }
		}
		
		while(count<arr.length){
		    arr[count]=0;
		    count++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
