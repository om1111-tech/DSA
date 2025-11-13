/******************************************************************************
5. Move All Zeros to the End (Method 2)
*******************************************************************************/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 13, 19, 0, 4, 0, 0, 0, 8};

        int j = 0;  // Pointer for non-zero position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }
}
