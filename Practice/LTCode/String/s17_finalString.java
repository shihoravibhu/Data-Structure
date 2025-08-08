// 2810. Faulty Keyboard

public class s17_finalString {
      // public String rev(String str){        

    //     return new StringBuilder(str).reverse().toString();
    // }
    public String finalString(String s) {        

        // for(int i=0 ; i<s.length() ;i++){

        //     if(s.charAt(i) == 'i'){

        //         s = rev(s.substring(0,i)) + s.substring(i+1,s.length());
        //         i--;
        //     }
        // }
        // return s;

        // or (Optimize)

        StringBuilder sb  = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == 'i'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        
    }
}
