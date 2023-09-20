package recursionAndBacktracking;

public class CountSSWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println("Count : " + countSS(0, 4, 0, arr));
    }

    private static int countSS(int idx, int targetSum, int currentSum, int[] arr) {
        if (idx == arr.length) {
            if (targetSum == currentSum) {
                return 1;
            } else {
                return 0;
            }
        }

        int inclusive = countSS(idx + 1, targetSum, currentSum + arr[idx], arr);
        int exclusive = countSS(idx + 1, targetSum, currentSum, arr);
        return inclusive + exclusive;
    }
}