package Service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PermutationServiceTest {

    @Test
    void testGetPermutaions1() {
        List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();
        PermutationService permutationService = new PermutationService();

        testArrayList = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(2, 3, 2), Arrays.asList(3, 2, 2));
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{2, 2, 3});
        assertEquals(outputArrayList, testArrayList);
    }

    @Test
    void testGetPermutaions2() {
        List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();
        PermutationService permutationService = new PermutationService();

        testArrayList = Arrays.asList(Arrays.asList(1, 2, 3, 3), Arrays.asList(1, 3, 2, 3), Arrays.asList(1, 3, 3, 2),
                Arrays.asList(2, 1, 3, 3), Arrays.asList(2, 3, 1, 3), Arrays.asList(2, 3, 3, 1), Arrays.asList(3, 2, 1, 3),
                Arrays.asList(3, 2, 3, 1), Arrays.asList(3, 1, 2, 3), Arrays.asList(3, 1, 3, 2),
                Arrays.asList(3, 3, 1, 2), Arrays.asList(3, 3, 2, 1));
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{1, 2, 3, 3});
        assertEquals(outputArrayList, testArrayList);
    }

    @Test
    void testGetPermutaions3() {
        List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();
        PermutationService permutationService = new PermutationService();

        testArrayList = Arrays.asList();
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{});
        assertEquals(outputArrayList, testArrayList);
    }

    @Test
    void testGetPermutaions4() {
        List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();
        PermutationService permutationService = new PermutationService();

        testArrayList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 1));
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{1, 2, 3});
        assertNotEquals(outputArrayList, testArrayList);
    }

    @Test
    void testGetPermutaions5() {
        List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();
        PermutationService permutationService = new PermutationService();

        testArrayList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 1), Arrays.asList(2, 1));
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{1, 2});
        assertNotEquals(outputArrayList, testArrayList);
    }


}