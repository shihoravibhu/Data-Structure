// 500. Keyboard Row

import java.util.ArrayList;
import java.util.List;

public class a49_findWords {
    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();
        
        String r1alpha = "qwertyuiop";
        String r2alpha = "asdfghjkl";
        String r3alpha = "zxcvbnm";

        for(String word : words){

            boolean r1 = false;
            boolean r2 = false;
            boolean r3 = false;

            for(char ch : word.toLowerCase().toCharArray()){

                if(r1alpha.indexOf(ch) >= 0){
                    r1 = true;
                }
                else if(r2alpha.indexOf(ch) >= 0){
                    r2 = true;
                }
                else if(r3alpha.indexOf(ch) >= 0){
                    r3 = true;
                }

                if((r1 && r2) || (r1 && r3) || (r2 && r3)){
                    break;
                }
            }

            int count = (r1 ? 1 : 0) + (r2 ? 1 : 0) + (r3 ? 1 : 0);

            if(count == 1){
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        
    }
}
