package item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        // given
        int[] param = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {1, 2, 3, 4, 6, 10};

        // when
        MergeSort.printArray(param);
        MergeSort.mergeSort(param);
        MergeSort.printArray(param);

        // then
        assertArrayEquals(expectedArray, param);
    }

    @Test
    public void parameterIsNull() {
        // given
        int[] param = null;

        // when
        MergeSort.mergeSort(param);

        // then
        assertNull(param);
    }

}