package recursionAndBacktracking;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("MADAM is palindrome : " + isPalindrome("MADAM", 0));
        System.out.println("MAD is palindrome : " + isPalindrome("MAD", 0));
    }

    private static boolean isPalindrome(String input, int index) {
        while (index <= input.length()/2) {
            if (input.charAt(index) != input.charAt(input.length()-index-1)) {
                return false;
            }
            isPalindrome(input, ++index);
        }
        return true;
    }
}
