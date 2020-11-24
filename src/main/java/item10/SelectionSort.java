package item10;

public class SelectionSort {

    /**
     * Name: selectionSort
     * Date: 2020/11/21
     * Info:
     *  외부에서 요청하는 선택정렬 메서드
     */
    public static int[] selectionSort(final int[] arr) {
        return selectionSort(arr, true);
    }

    /**
     * Name: selectionSort
     * Date: 2020/11/21
     * Info:
     *  외부에서 요청하는 내림차순 가능한 선택정렬 메서드
     */
    public static int[] selectionSort(final int[] arr, final boolean isAscending) {
        if (arr == null) {
            return null;
        }
        return selectionSort(arr, 0, isAscending);
    }

    /**
     * Name: selectionSort
     * Date: 2020/11/21
     * Info:
     *  선택정렬 알고리즘을 구현한 메서드
     */
    private static int[] selectionSort(final int[] arr, final int startIdx, final boolean isAscending) {
        if (startIdx < arr.length - 1) {
            int minIdx = startIdx;
            for (int i = startIdx; i < arr.length; i++) {
                if (isChange(arr[i], arr[minIdx], isAscending)) {
                    minIdx = i;
                }
            }
            swap(arr, startIdx, minIdx);
            selectionSort(arr, startIdx + 1, isAscending);
        }
        return arr;
    }

    /**
     * Name: isChange
     * Date: 2020/11/21
     * Info:
     *  오름차순 OR 내림차순에 따라 swap 여부를 결정하는 메서드
     */
    private static boolean isChange(final int target, final int minValue, final boolean isAscending) {
        if (isAscending && target < minValue
            || !isAscending && target > minValue) {
            return true;
        }
        return false;
    }

    /**
     * Name: swap
     * Date: 2020/11/21
     * Info:
     *  시작값과 최소값의 위치를 변경하는 메서드
     */
    private static void swap(final int[] arr, final int startIdx, final int minIdx) {
        int tempValue = arr[startIdx];
        arr[startIdx] = arr[minIdx];
        arr[minIdx] = tempValue;
    }

    /**
     * Name: printArray
     * Date: 2020/11/21
     * Info:
     *  배열 값을 출력하는 메서드
     */
    public static void printArray(final int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
