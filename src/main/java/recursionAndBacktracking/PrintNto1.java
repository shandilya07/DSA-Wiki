package recursionAndBacktracking;

public class PrintNto1 {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        if (n >= 1) {
            System.out.println(n);
            print(--n);
        }
    }
}