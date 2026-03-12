public class PalindromeChecker {

    public static boolean isPalindrome(String str, int start, int end) {

        // base condition
        if (start >= end) {
            return true;
        }

        // check characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
