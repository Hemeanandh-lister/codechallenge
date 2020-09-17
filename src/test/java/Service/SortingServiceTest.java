package Service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingServiceTest {

    SortingService sortingService = new SortingService();

    @Test
    void sortOddEvenNumbers() {
        int[] outPutArray = sortingService.sortOddEvenNumbers(new int[]{56, 31, 26, 7, 23, 78, 19, 3, 12});
        int[] expectedSortedArray = new int[]{3, 7, 19, 23, 31, 12, 26, 56, 78};
        assertEquals(Arrays.equals(outPutArray, expectedSortedArray), true);
    }

    @Test
    void sortOddEvenNumbers1() {
        int[] outPutArray = sortingService.sortOddEvenNumbers(new int[]{2, 365, 6, 4});
        int[] expectedSortedArray = new int[]{365, 2, 4, 6};
        assertEquals(Arrays.equals(outPutArray, expectedSortedArray), true);
    }

    @Test
    void sortOddEvenNumbers2() {
        int[] outPutArray = sortingService.sortOddEvenNumbers(new int[]{25, 4, 12, 9});
        int[] expectedSortedArray = new int[]{4, 9, 12, 25};
        assertEquals(Arrays.equals(outPutArray, expectedSortedArray), false);
    }
}