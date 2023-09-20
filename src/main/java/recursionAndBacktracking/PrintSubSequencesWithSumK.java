package recursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequencesWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        printSub(0, 2, 0, arr, new ArrayList<>());
    }

    private static void printSub(int idx, int k, int sum, int[] arr, List<Integer> hold) {
        if (idx == arr.length) {
            if (sum == k) {
                printList(hold);
                System.out.println();
            }
            return;
        }

        hold.add(arr[idx]);
        printSub(idx+1, k, sum+arr[idx], arr, hold);
        hold.remove(hold.size()-1);
        printSub(idx+1, k, sum, arr, hold);
    }

    private static void printList(List<Integer> list) {
        list.forEach(System.out::print);
    }
}

// TC is O(2 ^ n), since every spot has two options, select or not select
// SC is O(n), since at max, arr.len would be the maximum stack depth