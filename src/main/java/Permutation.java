import Service.PermutationService;

import java.util.List;
import java.util.Scanner;

public class Permutation {

    /**
     * Gets input array from user and prints list of array containing all permutations of array elements.
     *
     * @param args
     */
    public static void main(String[] args) {

        List<List<Integer>> arrayList;

        System.out.println("Enter number of elements in array");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int arr[] = new int[arrSize];

        System.out.println("Enter array elements");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        PermutationService permutationService = new PermutationService();
        arrayList = permutationService.getPermutaions(arr);

        System.out.println("The combinations are");
        System.out.println(arrayList);

    }
}
