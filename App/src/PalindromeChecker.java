


public class PalindromeChecker {
    public static void main(String[] args) {

        String original = "level";   // hardcoded string
        String reversed = "";

        // reverse using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
