import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";   // hardcoded string
        Stack<Character> stack = new Stack<>();

        // push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        // pop and compare
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
