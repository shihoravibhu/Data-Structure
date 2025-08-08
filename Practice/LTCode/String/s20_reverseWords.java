// 557. Reverse Words in a String III

public class s20_reverseWords {
    public String rev(String str){
        // StringBuilder sb = new StringBuilder();

        // for(int i=str.length() -1 ; i>=0 ; i--){
        //     sb.append(str.charAt(i));
        // }

        // return sb.toString();

        // or

        return new StringBuilder(str).reverse().toString();
    }
    public String reverseWords(String s) {

        String[] str = s.split(" ");

        for(int i=0 ; i<str.length ; i++){
            str[i] = rev(str[i]);
        }

        return String.join(" ",str);
        
    }
    public static void main(String[] args) {
        
    }
}
