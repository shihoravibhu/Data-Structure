public class s23_addStrings {
    public static String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();

        int carry = 0 , i = num1.length() - 1 , j = num2.length() - 1 , sum = 0;

        while(i>= 0 || j>=0 || carry !=0){
          
            int n1 = (i>=0) ? num1.charAt(i) - '0': 0;
            int n2 = (j>=0) ? num2.charAt(j) - '0' : 0;

            i--;
            j--;

            sum = n1+n2+carry;

            sb.append(sum % 10);

            carry = sum / 10;
                   
        }

        return sb.reverse().toString();
       
    }
    public static void main(String[] args) {
        System.out.println(addStrings("11","123"));
    }
}
