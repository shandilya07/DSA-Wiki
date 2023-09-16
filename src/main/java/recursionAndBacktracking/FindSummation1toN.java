package recursionAndBacktracking;

public class FindSummation1toN {
    public static void main(String[] args) {
        int sum = 0;
        parametrised(3, sum);
        System.out.println("Sum is : " + sum);
        System.out.println("Sum is : " + functional(3));
    }

    // This will not work as expected since sum here is an int, and it's a pass by value in Java
    // If this kind of implementation is needed, make use of AtomicInteger. Using an Integer won't
    // work as well, since Integer is immutable. Other way could be writing a mutable wrapper of the int
    private static void parametrised(int n, int sum) {
        if (n >= 1) {
            sum += n;
            parametrised(--n, sum);
        }
    }

    private static int functional(int n) {
        if (n == 1) {
            return 1;
        }
        return n + functional(n-1);
    }
}