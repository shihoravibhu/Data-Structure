// 242. Valid Anagram
public class s4_Valid_Anagram{
      public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // for(int i=0 ; i<s.length() ; i++){
        //     char ch = s.charAt(i);
        //     int idx = t.indexOf(ch);

        //     if(idx == -1){
        //        return false;
        //     }

        //     // ahiya apde replace function nai vapri sakiye karn k tenathi badha ocurrance ek sathe j remove thi jase so by substring
        //     t = t.substring(0,idx) + t.substring(idx+1);
        // }

        // // return s.equals("");

        // return t.isEmpty();

        // or (More Optimize)

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        
        
    }
}
