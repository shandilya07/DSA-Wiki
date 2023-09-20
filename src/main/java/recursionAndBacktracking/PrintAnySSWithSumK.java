package recursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAnySSWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        printSub(0, arr, 0, 2, new ArrayList<>());
    }

    private static boolean printSub(int idx, int[] arr, int currentSum, int targetSum, List<Integer> hold) {
        if (idx == arr.length) {
            if (currentSum == targetSum) {
                printList(hold);
                System.out.println();
                return true;
            } else {
                return false;
            }
        }

        hold.add(arr[idx]);
        if (printSub(idx+1, arr, currentSum + arr[idx], targetSum, hold)) {
            return true;
        }
        hold.remove(hold.size()-1);
        return printSub(idx + 1, arr, currentSum, targetSum, hold);
    }
    // The line #28 is equivalent to
    //if (printSub(idx+1, arr, currentSum, targetSum, hold)) {
    //    return true;
    //}
    //return false;

    private static void printList(List<Integer> list) {
        list.forEach(System.out::print);
    }
}

/*
 * This question has an important technique which can be leveraged in the other places to preemptively end recursion
 * Make the recursive method return boolean, whenever you have a true outcome for a recursive call, return there
 * No need to go down the calls in the sequence.
 */