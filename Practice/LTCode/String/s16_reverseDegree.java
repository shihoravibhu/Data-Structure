// 3498. Reverse Degree Of a String

public class s16_reverseDegree {
     public int reverseDegree(String s) {

        int degree = 0;
        int i = 1;

        for(char ch : s.toCharArray()){
            degree += (('z' - ch) + 1) * i;
            i++;
        }

        return degree;
        
    }
    public static void main(String[] args) {
        
    }
}
