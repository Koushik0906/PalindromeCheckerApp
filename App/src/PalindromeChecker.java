import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // add characters to stack and queue
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }

        boolean isPalindrome = true;

        // compare dequeue vs pop
        for (int i = 0; i < str.length(); i++) {
            if (queue.remove() != stack.pop()) {
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
