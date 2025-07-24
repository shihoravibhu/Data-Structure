public class m10_Multiply_String {
    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";
        
           int n1 = 0;
        int n2 = 0;

        for(int i=0 ; i<num1.length() ;i++){    // Convert num1 to integer n1
            n1 += (num1.charAt(i) - '0') * Math.pow(10,num1.length()-i-1);
        }

        for(int i=0 ; i<num2.length() ;i++){    // Convert num2 to integer n2
            n2 += (num2.charAt(i) - '0') * Math.pow(10,num2.length()-i-1);
        }

        System.out.println(n1);
        System.out.println(n2);
        
        String str = "" + (n1 * n2);
        System.out.println(str);

    
    }
}
