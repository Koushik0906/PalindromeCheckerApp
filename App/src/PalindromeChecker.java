public class PalindromeChecker {

    // method to check palindrome
    public boolean checkPalindrome(String str) {

        String processed = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;

        while (start < end) {
            if (processed.charAt(start) != processed.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
