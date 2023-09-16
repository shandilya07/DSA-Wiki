package recursionAndBacktracking;

public class Print1toN {
    public static void main(String[] args) {
        print(1, 5);
    }

    private static void print(int m, int n) {
        if (m <= n) {
            System.out.println(m);
            print(++m, n);
        }
    }
}