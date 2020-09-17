import Service.SortingService;

import java.util.*;

public class SortOddEven {

    public static void main(String[] args) {

        System.out.println("Enter number of elements in array");

        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int arr[] = new int[arrSize];

        System.out.println("Enter array elements");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        SortingService sortOddEven = new SortingService();
        arr = sortOddEven.sortOddEvenNumbers(arr);

        System.out.println("The sorted Array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }


}
