package item10;

public class BubbleSort {
    /**
     * Name: bbubbleSort
     * Date: 2020/11/20
     * Info:
     *  외부에서 버블정렬을 요청할 수 있는 메서드
     */
    public static int[] bubbleSort(final int[] arr) {
        return bbubbleSort(arr, true);
    }
    public static int[] bbubbleSort(final int[] arr, final boolean isAscending) {
        if (arr == null) {
            return null;
        }
        bubbleSort(arr, arr.length - 1, isAscending);
        return arr;
    }

    /**
     * Name: bubbleSort
     * Date: 2020/11/20
     * Info:
     *  배열의 길이 -1 까지 돌면서 버블정렬을 실행
     */
    private static void bubbleSort(final int[] arr, final int lastIdx, final boolean isAscending) {
        if (lastIdx > 0) {
            for (int i = 0; i < lastIdx; i++) {
                if (needSwap(arr[i], arr[i+1], isAscending)) {
                    swap(arr, i, i+1);
                }
            }
            bubbleSort(arr, lastIdx - 1, isAscending);
        }
    }

    /**
     * Name: needSwap
     * Date: 2020/11/20
     * Info:
     *  오름차순 혹은 내림차순 정렬에 따라 swap이 필요한지 판단하는 메서드
     */
    private static boolean needSwap(final int target, final int source, final boolean isAscending) {
        if ( isAscending && target > source
             || !isAscending && target < source) {
            return true;
        }
        return false;
    }

    /**
     * Name: swap
     * Date: 2020/11/20
     * Info:
     *  배열 내에서 두 인덱스의 값을 변환하는 메서드
     */
    private static void swap (final int[] arr, final int targetIdx, final int moveIdx) {
        int temp = arr[targetIdx];
        arr[targetIdx] = arr[moveIdx];
        arr[moveIdx] = temp;
    }

    /**
     * Name: print
     * Date: 2020/11/20
     * Info:
     *  데이터 확인을 위해 만든 메서드
     */
    public static void print(final int[] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
