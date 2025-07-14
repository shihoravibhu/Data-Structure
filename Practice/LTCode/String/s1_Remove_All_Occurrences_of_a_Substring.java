// 1910. Remove All Occurrences of a Substring

public class s1_Remove_All_Occurrences_of_a_Substring {

      public String removeOccurrences(String s, String part) {

        StringBuilder str = new StringBuilder(s);

        while(str.indexOf(part)!=-1){
           str.delete(str.indexOf(part),str.indexOf(part)+part.length()) ;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        
    }
}
