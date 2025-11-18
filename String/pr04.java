/******************************************************************************
4. Find the Largest (Longest) Word in a Sentence
*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        String s = "omnmagalkar om kishor";

        String[] sr = s.split(" ");

        String largestWord = sr[0];  // store word

        for(int i = 1; i < sr.length; i++){
            if(sr[i].length() > largestWord.length()){
                largestWord = sr[i];
            }
        }

        System.out.println("Largest word: " + largestWord);
        System.out.println("Length: " + largestWord.length());
    }
}

