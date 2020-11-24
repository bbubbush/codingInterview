package item10;

public class MergeSort {

    /**
     * Name: mergeSort
     * Date: 2020/11/24
     * Info:
     *  외부에서 요청할 수 있는 병합정렬 메서드
     */
    public static void mergeSort(final int[] arr) {
        if (arr == null) {
            return;
        }
        int[] tempArray = new int[arr.length];
        mergeSort(arr, tempArray, 0, arr.length - 1);
    }

    /**
     * Name: mergeSort
     * Date: 2020/11/24
     * Info:
     *  재귀적으로 분할 & 병합하는 메서드
     */
    private static void mergeSort(final int[] arr, final int[] tempArray, final int startIdx, final int endIdx) {
        if (startIdx < endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            // divide
            mergeSort(arr, tempArray, startIdx, midIdx);
            mergeSort(arr, tempArray, midIdx + 1, endIdx);
            // conquer
            merge(arr, tempArray, startIdx, midIdx, endIdx);
        }
    }

    /**
     * Name: merge
     * Date: 2020/11/24
     * Info:
     *  분할된 두 배열을 하나로 합치는 메서드
     */
    private static void merge(final int[] arr, final int[] tempArray, final int startIdx, final int midIdx, final int endIdx) {
        // 01. variable init.
        for (int i = startIdx; i <= endIdx; i++) {
            tempArray[i] = arr[i];
        }
        int part1 = startIdx;
        int part2 = midIdx + 1;
        int index = startIdx;

        // 02. add two array.
        while (part1 <= midIdx && part2 <= endIdx) {
            if (tempArray[part1] <= tempArray[part2]) {
                arr[index] = tempArray[part1];
                part1++;
            }
            else {
                arr[index] = tempArray[part2];
                part2++;
            }
            index++;
        }

        // 03. check empty to first array.
        for (int i = 0; i <= midIdx - part1; i++) {
            arr[index + i] = tempArray[part1 + i];
        }
    }

    public static void printArray(int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
