// 1323. Maximum 69 Number

public class m15_maximum69Number {
     public int maximum69Number (int num) {
        
        // int i=0;
        // int arr[] = new int[String.valueOf(num).length()]; 

        // while(num != 0){
        //     arr[i++] = num % 10;
        //     num = num / 10;
        // }

        // for(i=arr.length-1 ; i >= 0 ; i--){

        //     if(arr[i] == 6){
        //         arr[i] = 9;
        //         break;
        //     }
        // }

        // StringBuilder str = new StringBuilder("");

        // for(i=arr.length-1 ; i >= 0 ; i--){
        //     str.append(arr[i]);
        // }

        // return Integer.parseInt(str.toString());

        // or

         char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(digits));
    }
    public static void main(String[] args) {
        
    }
    
}
