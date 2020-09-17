package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationService {
        List<List<Integer>> outputArrayList = new ArrayList<List<Integer>>();

        public List<List<Integer>> getPermuttaions(int[] elements) {
            if(elements != null && elements.length >1) {
                printAllRecursive(elements.length, 0, elements);
            } else if(elements.length == 1){
                outputArrayList.add(Arrays.stream(elements).boxed().collect(Collectors.toList()));
            }
            return outputArrayList;
        }


    public  void printAllRecursive(
            int n, int index, int[] elements) {

        if(index == elements.length -1) {
            outputArrayList.add(Arrays.stream(elements).boxed().collect(Collectors.toList()));
        } else {
            for(int i = index; i < n; i++) {
                if (shouldSwap(elements, index, i)) {
                    swap(elements, index, i);
                    printAllRecursive(n ,index+1, elements);
                        swap(elements, index, i);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private boolean shouldSwap(int[] arr, int start, int index) {
        for (int i = start; i < index; i++) {
            if (arr[i] == arr[index]) {
                return false;
            }
        }
        return true;
    }




//    ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    public void getPermutation(int[] inputArray) {
//
//
//        generatePermutations(inputArray,0, inputArray.length);
//    }
//
//    public void generatePermutations(int[] inputArray,int index) {
//
//        if(index == inputArray.length -1) {
//
//        }
//
//        for(int i=index;i<inputArray.length; i++) {
//            if(inputArray[index] != inputArray[index]) {
//                int temp = inputArray[index];
//                inputArray[index] = inputArray[i];
//                inputArray[i] = temp;
//
//                generatePermutations();
//
//                temp = inputArray[index];
//                inputArray[index] = inputArray[i];
//                inputArray[i] = temp;
//            }
//        }
//
//    }
}
