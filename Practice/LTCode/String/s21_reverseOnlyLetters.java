// 917. Reverse Only Letters

public class s21_reverseOnlyLetters {
     public String reverseOnlyLetters(String s) {
        
        // StringBuilder sb = new StringBuilder();

        // for(char ch : s.toCharArray()){
        //     if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z')){
        //     sb.append(ch);
        //     }
        // }

        // char ch[] = sb.reverse().toString().toCharArray();

        // StringBuilder sb2 = new StringBuilder();
        // int i=0;

        // for(char ch2 : s.toCharArray()){
        //     if((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <='Z')){
        //         sb2.append(ch[i++]); 
        //     }
        //     else{
        //         sb2.append(ch2);
        //     }

        // }

        // return sb2.toString();

        // or (optimize)

         char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(str[left])) left++;
            while (left < right && !Character.isLetter(str[right])) right--;

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
