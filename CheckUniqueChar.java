import java.util.Arrays;

public class CheckUniqueChar {
    public static void main(String[] args) {
      String str = "abcdefg";
      if (hasUniqueCharacters(str)) {
        System.out.println("The string contains all unique characters.");
      } else {
        System.out.println("The string does not contain all unique characters.");
      }
    }
  
    public static boolean hasUniqueCharacters(String str) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      for (int i = 0; i < chars.length - 1; i++) {
        if (chars[i] == chars[i + 1]) {
          return false;
        }
      }
      return true;
    }
  }
  