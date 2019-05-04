package loops;

public class Q4 {

    static boolean checkPalindrome(Integer n) {
        String intstr = n.toString();
        for (int i = 0; i < intstr.length(); i++) {
            if (intstr.charAt(i) != intstr.charAt(intstr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Input here:
        Integer input = 336323633;

        System.out.println(checkPalindrome(input) ? "The integer " + input + " is a palindrome"
                : "The integer " + input + " is not a palindrome");
    }

}