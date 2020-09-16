import Service.PermutationService;

import java.util.List;

public class Permutation {

    public static void main(String[] args) {

        List<List<Integer>> arrayList;

        PermutationService permutationService = new PermutationService();
        arrayList = permutationService.getPermuttaions(0,new int[]{});

        System.out.println(arrayList);

    }
}
