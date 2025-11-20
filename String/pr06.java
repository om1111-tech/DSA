/******************************************************************************
5.Count each character frequency
*******************************************************************************/
public class Main {

    public static void findFrequency(String s) {

        s = s.replaceAll("\\s", "").toLowerCase();

        int[] freq = new int[256]; // For all ASCII characters

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        findFrequency("Programming");
    }
}
