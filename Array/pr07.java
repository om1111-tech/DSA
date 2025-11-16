/******************************************************************************
7. Rotate Array by K Positions
*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1,2,3,4,5,6};

        int k = 3; // Number of positions to rotate
        int[] temp = new int[arr.length];

        // Rotate
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }

        // Copy back to original array (optional)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        // Print rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

