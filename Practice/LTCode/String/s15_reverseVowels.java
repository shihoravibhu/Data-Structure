// 345. Reverse Vowels of a String

public class s15_reverseVowels {
     public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public String reverseVowels(String s) {
        
    //    char[] ch = s.toCharArray();
    //     int n = 0;

    //     // Count number of vowels
    //     for (char vo : ch) {
    //         if (isVowel(vo)) {
    //             n++;
    //         }
    //     }

    //     // Store vowels in array
    //     char[] vowel = new char[n];
    //     int vi = 0;

    //     for (char vo : ch) {
    //         if (isVowel(vo)) {
    //             vowel[vi++] = vo;
    //         }
    //     }

    //     // Replace vowels from the end of vowel[] in original array
    //     vi = n - 1;
    //     for (int i = 0; i < ch.length; i++) {
    //         if (isVowel(ch[i])) {
    //             ch[i] = vowel[vi--];
    //         }
    //     }

    //     return new String(ch);

        // or (optimize)

        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;

        while (left < right) {
            while (left < right && !isVowel(str[left])) left++;
            while (left < right && !isVowel(str[right])) right--;

            // swap vowels
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        return new String(str);
    }
    public static void main(String[] args) {
        
    }
}
