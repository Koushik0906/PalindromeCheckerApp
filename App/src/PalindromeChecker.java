public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (processed.charAt(start) != processed.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
