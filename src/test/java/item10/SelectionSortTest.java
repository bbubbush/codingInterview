package item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSortAscending() {
        // given
        int[] param = {1, 10, 2, 7, 9, 4};
        int[] expectedArray = {1, 2, 4, 7, 9, 10};

        // when
        int[] sortingArray = SelectionSort.selectionSort(param);

        // then
        assertArrayEquals(expectedArray, sortingArray);
    }

    @Test
    public void selectionSortDescending() {
        // given
        int[] param = {1, 10, 2, 7, 9, 4};
        int[] expectedArray = {10, 9, 7, 4, 2, 1};

        // when
        int[] sortingArray = SelectionSort.selectionSort(param, false);

        // then
        assertArrayEquals(expectedArray, sortingArray);
    }

    @Test
    public void selectionSortAscendingUseNull() {
        // given
        int[] paraam = null;

        // when
        int[] sortingArray = SelectionSort.selectionSort(paraam);

        // then
        assertNull(sortingArray);
    }
}