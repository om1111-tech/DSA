/******************************************************************************
1. Reverse a String
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//Method 1:-
		String s="om Kishor";
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
		    rev+=s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		//Method 2:-
		StringBuilder sb=new StringBuilder(s);
		sb.reverse().toString();
		
		System.out.println(sb);
	}
}
