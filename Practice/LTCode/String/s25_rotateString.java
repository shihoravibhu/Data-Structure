// 796. Rotate String

public class s25_rotateString {
     public static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }
        
        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for(int i=0 ; i<n ; i++){

            // Rotate: move first char to end
            sb.append(s.substring(1));
            sb.append(s.charAt(0));

            s = sb.toString();
            
            if(s.equals(goal)){
                return true;
            }

            System.out.println(sb);  

            sb = new StringBuilder();
           
        }

        return false;

         // or (More Optimize)

        // return s.length() == goal.length() && (s+s).contains(goal);
    }
    public static void main(String[] args) {

        System.out.println(rotateString("abcabc","cababc"));
    }
}
    // bcdea 
    // cdeab