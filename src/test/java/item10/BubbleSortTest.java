package item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortAscending() {
        // given
        int[] param = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {1, 2, 3, 4, 6, 10};

        // when
        int[] sortingArray = BubbleSort.bubbleSort(param);

        // then
        assertArrayEquals(expectedArray, sortingArray);
    }

    @Test
    public void bubbleSortDescending() {
        // given
        int[] param = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {10, 6, 4, 3, 2, 1};

        // when
        int[] sortingArray = BubbleSort.bbubbleSort(param, false);

        // then
        assertArrayEquals(expectedArray, sortingArray);
    }

    @Test
    public void bubbleSortAscendingUseNull() {
        // given
        int[] paraam = null;

        // when
        int[] sortingArray = BubbleSort.bubbleSort(paraam);

        // then
        assertNull(sortingArray);
    }
}