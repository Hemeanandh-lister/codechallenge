package Service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PermutationServiceTest {

    List<List<Integer>> testArrayList = new ArrayList<List<Integer>>();


    PermutationService permutationService = new PermutationService();

    @Test
    void getPermuttaions() {
        testArrayList = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(2, 3, 2), Arrays.asList(3, 2, 2));
        List<List<Integer>> outputArrayList = permutationService.getPermutaions(new int[]{2, 2, 3});
        assertEquals(outputArrayList, testArrayList);
    }

    @Test
    void printAllRecursive() {
    }
}