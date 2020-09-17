package Service;

import java.util.ArrayList;
import java.util.List;

public class PermutationService {
    List<List<Integer>> outputArrayList = new ArrayList<List<Integer>>();

    /**
     *
     * @param elements - Input Array for which permutaion has to be generated
     * @return - Array of Array with all combinations.
     */
    public List<List<Integer>> getPermutaions(int[] elements) {

        if (elements != null && elements.length > 1) {
            getAllRecursive(0, elements);
        } else if (elements.length == 1) {

            List<Integer> currentArrayList = new ArrayList<Integer>(elements.length);
            for (int i : elements) {
                currentArrayList.add(i);
            }
            outputArrayList.add(currentArrayList);
        }
        return outputArrayList;
    }

    /**
     * @param index    - Current start position
     * @param elements - Input Array
     */
    public void getAllRecursive(
            int index, int[] elements) {
        int arrLength = elements.length;
        if (index == elements.length - 1) {
            List<Integer> currentArrayList = new ArrayList<Integer>(elements.length);
            for (int i : elements) {
                currentArrayList.add(i);
            }
            outputArrayList.add(currentArrayList);
        } else {
            for (int i = index; i < arrLength; i++) {
                if (shouldSwap(elements, index, i)) {
                    swap(elements, index, i);
                    getAllRecursive(index + 1, elements);
                    swap(elements, index, i);
                }
            }
        }
    }

    /**
     * @param arr - Input array
     * @param i   - Swap element
     * @param j   - Swap element
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Usage - To determine whether swapping is necessary.
     *
     * @param arr            - Input Array
     * @param start          - Swap element
     * @param currentElement - Swap element
     * @return True : If currentElement is not found in Between start(included) and currentElement(excluded)
     */
    private boolean shouldSwap(int[] arr, int start, int currentElement) {
        for (int i = start; i < currentElement; i++) {
            if (arr[i] == arr[currentElement]) {
                return false;
            }
        }
        return true;
    }


}
