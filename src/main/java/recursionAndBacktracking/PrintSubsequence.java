package recursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> hold = new ArrayList<>();
        print(0, arr, hold);
    }

    private static void print(int index, int[] arr, List<Integer> hold) {
        if (index >= arr.length) {
            hold.forEach(System.out::print);
            System.out.println();
            return;
        }
        hold.add(arr[index]);
        print(index+1, arr, hold);
        hold.remove(hold.size()-1);
        print(index+1, arr, hold);
    }
}

// For each number in the input, there are two options, either pick or not pick. The time complexity is O(2^n)
// At any given time the stack will not have more than n waiting calls, the stack depth is n at max, sc is O(n)

// !!TIP!!
// Always be very careful which using pre- or post-increment when the variable is being used later on in the method