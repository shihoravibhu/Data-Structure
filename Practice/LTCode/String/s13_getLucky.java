// 1945. Sum of Digits of String After Convert

public class s13_getLucky {
     public int getLucky(String s, int k) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++){
            sb.append(s.charAt(i) - 'a' + 1);
        }

        int n = 0;

        while(k != 0){
        n = 0 ;

            for(int i=0 ; i<sb.length() ; i++){

 // pela char ma ferviyu ane pachi parseInt karva mate tene string ma fervavu pade so
            n += Integer.parseInt(String.valueOf(sb.charAt(i)));   
            }

            sb = new StringBuilder(String.valueOf(n));
            k--;
        }

        return n;
    }
    public static void main(String[] args) {
        
    }
}
