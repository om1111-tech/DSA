/******************************************************************************
11. Merge Two Sorted Arrays
*******************************************************************************/

public class Main{
    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0;  // pointer for arr1
        int j = 0;  // pointer for arr2
        int k = 0;  // pointer for merged array

        // Merge until one array is finished
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1 (if any)
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2 (if any)
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        System.out.print("Merged Sorted Array: ");
        for (int x : merged) {
            System.out.print(x + " ");
        }
    }
}
