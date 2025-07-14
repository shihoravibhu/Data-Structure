//67. Add Binary

public class m2_Add_Binary {

        public String addBinary(String a, String b) {
        
        int i=a.length()-1,j=b.length()-1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;

            if (i >= 0) sum += a.charAt(i) - '0';           // 0 ni ASCII value 48
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum%2);

            carry = sum/2;

            i--;
            j--;

        }

        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        
    }
}
