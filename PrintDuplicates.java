public class PrintDuplicates
{
    public static void main(String[] args) {
        String str = "abcdefghialkmghi";
        printDuplicates(str);

    }
    public static void printDuplicates(String str) {
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char c = str.charAt(i);
    
            // Check if the character appears again later in the string
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    // If the character is found again, print it
                    System.out.print(c);
                    break;
                }
            }
        }
    }
    
}