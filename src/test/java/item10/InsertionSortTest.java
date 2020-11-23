package item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        // given
        int[] param = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {1, 2, 3, 4, 6, 10};

        // when
        InsertionSort.insertionSort(param);

        // then
        assertArrayEquals(expectedArray, param);
    }

}