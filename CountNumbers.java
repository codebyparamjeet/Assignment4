public class CountNumbers
{
    public static void main(String[] args) {
        
        String str = "Hello, World!";

        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            consonantCount++;
        } else {
            specialCharCount++;
        }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Special Characters: " + specialCharCount);

    }
}