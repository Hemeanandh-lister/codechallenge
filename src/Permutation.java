import Service.PermutationService;

import java.util.List;
import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        List<List<Integer>> arrayList;

        System.out.println("Enter number of elements in array");

        Scanner scanner = new Scanner(System.in);

        int arrSize = scanner.nextInt();

        int arr[]=new int[arrSize];

        System.out.println("Enter array elements");

        for(int i=0;i<arrSize;i++){//for reading array
            arr[i]=scanner.nextInt();

        }



        PermutationService permutationService = new PermutationService();
        arrayList = permutationService.getPermuttaions(arr);

        System.out.println(arrayList);

    }
}
