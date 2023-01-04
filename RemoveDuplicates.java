public class RemoveDuplicates{
    public static void main(String[] args) {
        String str = "abcabcabcefdaffg";
        str = removeDuplicates(str);
        System.out.println(str); // Output: "abc"
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the current character is not already in the StringBuilder, append it
            if (sb.indexOf("" + c) == -1) {
                sb.append(c);
            }
        }

        // Return the modified String
        return sb.toString();
    }
}
