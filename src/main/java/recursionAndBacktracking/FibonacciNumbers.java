package recursionAndBacktracking;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        System.out.println("Fib : " + findFib(5));
    }

    private static int findFib(int n) {
        if(n < 2) {
            return n;
        }

        return findFib(n-1) + findFib(n-2);
    }
}