import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";

        LinkedList<Character> list = new LinkedList<>();

        // add characters to linked list
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare start and end
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
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
