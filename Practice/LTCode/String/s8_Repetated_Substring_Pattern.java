//459. Repeated Substring Pattern

public class s8_Repetated_Substring_Pattern {

     public boolean repeatedSubstringPattern(String s) {

        int n = s.length(); 

        for(int i=n/2 ; i>0 ; i--){         // i = length of possible substring
            

            if(n%i == 0){
                int times = n/i;    // ketli var substring ne add karvani
            

            StringBuilder sb = new StringBuilder();         //For string apde dar vakhte string ma substring concate karavi pane so its take more time becasue string is immutable so we use StringBuilder ahiya

            while(times > 0){
               sb.append(s.substring(0,i));
                times--;
            }
            if(s.equals(sb.toString())){
                return true;
            }
            }

        }

        return false;
        
    }
    public static void main(String[] args) {
        
    }
}
