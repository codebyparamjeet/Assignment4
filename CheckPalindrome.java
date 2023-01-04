public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "2552";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        // Loop through the string and compare the characters at the start and end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
