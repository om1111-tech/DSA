/******************************************************************************
2. Check if a String is Palindrome
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//Method 1:-
		String s="kisik";
		boolean ispal=true;
		
		for(int i=0;i<(s.length()/2);i++){
		    if(s.charAt(i)!=s.charAt(s.length()-1-i)){
		        ispal=false;
		    }
		}
		
		if(ispal){
		    System.out.println("ya Palindrome");
		}
		else{
		    System.out.println("no pal");
		}
		
		
		
		//Method 2:-
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		
		System.out.println(rev.equals(s)?"palindrome" : "not pal");
		
		
	}
}
