import java.util.Arrays;

public class CheckAnagram {
        public static void main(String[] args) {
          String str1 = "anagram";
          String str2 = "nagaram";
      
          // Remove spaces and non-letter characters
          str1 = removeSpacesAndNonLetters(str1);
          str2 = removeSpacesAndNonLetters(str2);
      
          // Sort the strings
          str1 = sortString(str1);
          str2 = sortString(str2);
      
          // Check if the strings are equal
          if (str1.equals(str2)) {
            System.out.println("The strings are anagrams.");
          } else {
            System.out.println("The strings are not anagrams.");
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
      
        // Sorts the characters in a string
        public static String sortString(String str) {
          char[] chars = str.toCharArray();
          Arrays.sort(chars);
          return new String(chars);
        }
}
