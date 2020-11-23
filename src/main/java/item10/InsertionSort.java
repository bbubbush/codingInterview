package item10;

public class InsertionSort {


    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempValue = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] <= tempValue) {
                    break;
                }
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tempValue;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
