public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";   // hardcoded string
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("String: "+str);
        if(str.equals(reversed)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is Not a Palindrome");
        }
    }
}
