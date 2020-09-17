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
    void isFirstNumberSmaller() {
        assertEquals(sortingService.isFirstNumberSmaller(2, 4), true);
        assertEquals(sortingService.isFirstNumberSmaller(2, 3), false);
    }

    @Test
    void isEven() {
        assertEquals(sortingService.isEven(2), true);
        assertEquals(sortingService.isEven(3), false);
    }

    @Test
    void isOdd() {
        assertEquals(sortingService.isOdd(3), true);
        assertEquals(sortingService.isOdd(10), false);
    }
}