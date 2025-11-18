/******************************************************************************
3. Count Vowels and Consonants in a String
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s="omnagalkar";
		int countvowel=0;
		int countconsonant=0;
		
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
		        countvowel++;
		    }
		    else{
		        countconsonant++;
		    }
		}
		
		System.out.println("Vowels count:"+countvowel);
		System.out.println("Vowels count:"+countconsonant);
		
	}
}
