package Backtracking;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        generatePermutations(nums, used, currentPermutation, result);

        return result;
    }

    private void generatePermutations(int[] nums, boolean[] used, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentPermutation.add(nums[i]);

                generatePermutations(nums, used, currentPermutation, result);

                used[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution permutations = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array:");
        int arrSize = sc.nextInt();
        System.out.println("enter element of array:");
        int[] nums = new int[arrSize];
        for(int i=0;i<arrSize;i++){
         nums[i]=sc.nextInt();
        }
        sc.close();
        
        List<List<Integer>> result = permutations.permute(nums);

        System.out.println(result);
    }
}

