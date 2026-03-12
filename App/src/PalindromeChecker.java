import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // add characters to deque
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // compare front and rear
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
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
