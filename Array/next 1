import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayAdvancedDemo {
    public static void main(String[] args) {

        // 1️⃣ 3D Array
        int[][][] cube = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        System.out.println("3D Array (Cube):");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.println(Arrays.toString(cube[i][j]));
            }
        }

        // 2️⃣ Cloning Arrays
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1.clone(); // creates a new copy
        arr2[0] = 99; // change in arr2 won't affect arr1
        System.out.println("\nOriginal arr1: " + Arrays.toString(arr1));
        System.out.println("Cloned arr2: " + Arrays.toString(arr2));

        // 3️⃣ ArrayList (Dynamic Array)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(5); // duplicate
        System.out.println("\nArrayList: " + list);

        // 4️⃣ Find Duplicates in ArrayList
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int num : list) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 5️⃣ Rotate Array (Right Rotation by 1)
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("Array after right rotation by 1: " + Arrays.toString(arr));
    }
}
