// 520. Detect Capital

public class s10_detectCapitalUse {
    
     public boolean detectCapitalUse(String word) {

        int n = word.length();
        int ch = 0;      // count of uppercase letters

        for (int i = 0; i < n; i++) {

            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                ch++;
            }
        }

        // 1) all caps   2) all lowercase   3) only first letter is capital
        if ((ch == n) || (ch == 0) || (ch == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')){

            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        
    }
}
