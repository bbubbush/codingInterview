package item10;

public class InsertionSort {

    /**
     * Name: insertionSort
     * Date: 2020/11/24
     * Info:
     *  외부에서 요청할 삽입정렬을 구현
     */
    public static int[] insertionSort(final int[] arr) {
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

    public static void printArray(final int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
