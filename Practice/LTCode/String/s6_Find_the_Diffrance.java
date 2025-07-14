// 389. Find the Diffrance

public class s6_Find_the_Diffrance{
     public char findTheDifference(String s, String t) {

        if(s.length() == 0){
            return t.charAt(0);
        }

        for(int i=0 ; i<t.length() ; i++){
            char ch = s.charAt(i);
            int idx = t.indexOf(ch);

            if(ch == t.charAt(idx)){
                t = t.substring(0,idx) + t.substring(idx+1);
            }
        }

        return t.charAt(0);

         // or (Optimize)

        // char result = 0;

        // for(int i=0 ; i<s.length() ; i++){
        //     result^=s.charAt(i);
        // }
        // for(int i=0 ; i<t.length() ; i++){
        //     result^=t.charAt(i);
        // }

        // return result;
        
    }
    public static void main(String[] args) {
        
    }
}
