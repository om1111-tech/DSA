import java.util.Arrays;

public class ArrayBasicsDemo {
    public static void main(String[] args) {

        // 1️⃣ Declaration, Creation, and Initialization
        int[] marks = {85, 90, 78, 92, 88};
        System.out.println("Original Array: " + Arrays.toString(marks));

        // 2️⃣ Traversing Array (for loop)
        System.out.println("\nTraversing using for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // 3️⃣ Traversing using enhanced for loop
        System.out.println("\nTraversing using enhanced for loop:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();

        // 4️⃣ Find Max, Min, Sum, Average
        int max = marks[0], min = marks[0], sum = 0;
        for (int m : marks) {
            if (m > max) max = m;
            if (m < min) min = m;
            sum += m;
        }
        double avg = (double) sum / marks.length;
        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        // 5️⃣ Sorting the Array
        Arrays.sort(marks);
        System.out.println("\nSorted Array: " + Arrays.toString(marks));

        // 6️⃣ Reversing the Array (manual)
        for (int i = 0; i < marks.length / 2; i++) {
            int temp = marks[i];
            marks[i] = marks[marks.length - 1 - i];
            marks[marks.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(marks));

        // 7️⃣ Copying Arrays
        int[] copyMarks = Arrays.copyOf(marks, marks.length);
        System.out.println("\nCopied Array: " + Arrays.toString(copyMarks));

        // 8️⃣ Searching (only works on sorted arrays)
        Arrays.sort(copyMarks);
        int index = Arrays.binarySearch(copyMarks, 88);
        System.out.println("Index of 88 (after sorting): " + index);

        // 9️⃣ 2D Array (Matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 🔟 Sum of 2D Array
        int total = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                total += val;
            }
        }
        System.out.println("Sum of all elements in matrix = " + total);

        // 1️⃣1️⃣ Jagged Array Example
        int[][] jagged = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
        };
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // ✅ Program End
        System.out.println("\n✅ All array basics demonstrated successfully!");
    }
}
