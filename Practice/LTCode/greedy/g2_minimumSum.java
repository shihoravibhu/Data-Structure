import java.util.Arrays;

public class g2_minimumSum {
      public int minimumSum(int num) {
        
        int[] arr = new int[4];

        int i=0;

        while(num != 0){            // badha digit ne array ma 
            arr[i++] = num % 10;
            num = num / 10;
        }

        Arrays.sort(arr);

        // for ex. 1234 che to
        //  new1 = 1 * 10 + 3 = 13 
        //  new2 = 2 * 10 + 4 = 24
        //  13 + 24 = 37 je minimum j hase 

        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];

        return num1 + num2;
      
    }
    public static void main(String[] args) {
        
    }
}
