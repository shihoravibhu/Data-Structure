// 43. Multiply Strings

public class s9_Multiply_Strings {

     public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int[] n1 = new int[n];
        int[] n2 = new int[m];

        for (int i = 0; i < n; i++) { // Convert num1 to integer n1 array

            // n1 += (num1.charAt(i) - '0') * Math.pow(10,num1.length()-i-1);   aa no kari sakiye due to integer overflow

            n1[i] = (num1.charAt(i) - '0');
        }

        for (int i = 0; i < m; i++) { // Convert num2 to integer n2 array

            // n2 += (num2.charAt(i) - '0') * Math.pow(10,num2.length()-i-1);

            n2[i] = (num2.charAt(i) - '0');
        }

        int[] res = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {

                int mul = n1[i] * n2[j];
                int sum = mul + res[i + j + 1];
                res[i + j + 1] = sum % 10; // add lastdigit of sum
                res[i + j] += sum / 10; // add carry to next position 
            }
        }

        // String str = "";         // not more efficent because in the java string is immutable so int this loop many time create new string and more time consuming 

        // for(int i : res){
        //      if (str.length() == 0 && i == 0) continue;
        //     str += i ;
        // }

        // return str;   

        StringBuilder sb = new StringBuilder();

        for (int num : res) {
            if (sb.length() == 0 && num == 0)
                continue; // this is only skip leadind element zero means its skip strating ma rahela zeroes

            sb.append(num);

        }

        return sb.toString();

    }
    public static void main(String[] args) {
        
    }
}
