public class MaxOccurChar {
    public static void main(String[] args) {
      String str = "abcabcabcddddeeeeeffffff";
      char maxChar = findMaxChar(str);
      System.out.println("The maximum occurring character is '" + maxChar + "'.");
    }
  
    public static char findMaxChar(String str) {
      // Create an array to store the count of each character
      int[] count = new int[256];
  
      // Iterate through each character in the string and increment the count for that character
      for (int i = 0; i < str.length(); i++) {
        count[str.charAt(i)]++;
      }
  
      // Find the index of the maximum count
      int maxIndex = 0;
      for (int i = 1; i < count.length; i++) {
        if (count[i] > count[maxIndex]) {
          maxIndex = i;
        }
      }
  
      // Return the character at the maximum index
      return (char) maxIndex;
    }
  }
  
