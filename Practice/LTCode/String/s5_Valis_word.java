public class s5_Valis_word {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        int vo = 0;
        int con = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vo++;
            } else if (ch >= 'a' && ch <= 'z') {
                con++;
            } else if (ch >= '0' && ch <= '9') {

            } else {
                return false;
            }
        }

        if (vo < 1 || con < 1) {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {

    }
}
