public class CheckPangram {
    public static void main(String[] args) {
      String str = "The quick brown fox jumps over the lazy dog.";
  
      // Remove spaces and non-letter characters
      str = removeSpacesAndNonLetters(str);
  
      // Create an array of the letters of the alphabet
      char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  
      // Initialize a counter
      int count = 0;
  
      // Iterate through each character in the string
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        for (int j = 0; j < alphabet.length; j++) {
          if (ch == alphabet[j]) {
            // Remove the character from the array
            alphabet[j] = ' ';
            count++;
            break;
          }
        }
      }
  
      // Check if the string is a pangram
      if (count == 26) {
        System.out.println("The string is a pangram.");
      } else {
        System.out.println("The string is not a pangram.");
      }
    }
  
    // Removes spaces and non-letter characters from a string
    public static String removeSpacesAndNonLetters(String str) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
          sb.append(ch);
        }
      }
      return sb.toString();
    }
  }
  