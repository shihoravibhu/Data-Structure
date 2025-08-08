// 541. Reverse String II

public class s18_reverseStr {
     public String reverseStr(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length() ;i+=2*k){

            // pela first k ne rev karva 
            int end = Math.min(i+k , s.length());
            StringBuilder firstk = new StringBuilder(s.substring(i,end));
            sb.append(firstk.reverse());

            // then tena pachi na next k ne append 
            if(end < s.length()){
                int nextEnd = Math.min(i+2*k , s.length());
                sb.append(s.substring(end,nextEnd));
            }
        }
       
        
        return sb.toString();        
    }
    public static void main(String[] args) {
        
    }
}
