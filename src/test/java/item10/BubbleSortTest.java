package item10;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortAscending() {
        // given
        int[] paraam = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {1, 2, 3, 4, 6, 10};

        // when
        int[] sortedArray = BubbleSort.bubbleSort(paraam);

        // then
        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void bubbleSortDescending() {
        // given
        int[] paraam = {1, 10, 2, 3, 6, 4};
        int[] expectedArray = {10, 6, 4, 3, 2, 1};

        // when
        int[] sortedArray = BubbleSort.bbubbleSort(paraam, false);

        // then
        assertArrayEquals(expectedArray, sortedArray);
    }
}