/******************************************************************************
5.Anagram
*******************************************************************************/

import java.util.Arrays;
public class Main
{
    public static boolean anagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        
        if (s1.length() != s2.length()) return false;
        
        char [] arr=s1.toCharArray();
        char [] arrr=s2.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arrr);
        
        return Arrays.equals(arr,arrr);
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(anagram("silent","listen"));
		
	}
}
