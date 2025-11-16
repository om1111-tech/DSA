/******************************************************************************
6. Remove Duplicates from Sorted Array
*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] arr = {1,2,2,3,4,5,5};

        int j = 0;  // Pointer for unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int maxlength = j + 1;

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < maxlength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
