// 1796. Second Largest Digit in a String

public class s24_secondHighest {
     public int secondHighest(String s) {
        
        // StringBuilder sb = new StringBuilder();

        // for(char ch : s.toCharArray()){
        //     if(Character.isDigit(ch)){
        //         sb.append(ch);
        //     }
        // }  
        // if (sb.length() == 0) return -1;

        // char[] digit = sb.toString().toCharArray();

        // Arrays.sort(digit);

        // int n = digit.length , j=0;  
        // int arr[] = new int[10];

        // arr[j++] = digit[0] - '0';      

        // for(int i = 1 ; i<n ; i++){
        //     if(digit[i-1] != digit[i]){
        //         arr[j++] = digit[i] - '0';
        //     }
            
        // }       

        // if(j < 2){
        //     return -1;
        // }
        // else{
        //     return arr[j - 2];
        // }

        // or

        // Set<Integer> set = new HashSet<>();

        //  for(char ch : s.toCharArray()){
        //     if(Character.isDigit(ch)){
        //         set.add(ch - '0');
        //     }
        // }  

        // if(set.size() < 2){  // not enough unique digits
        //     return -1;
        // }

        // int max = Collections.max(set); // remove the largest
        // set.remove(max);

        // return Collections.max(set);

        // or (Optimize)

        boolean[] seen = new boolean[10]; // To mark which digits are present

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                seen[ch - '0'] = true;
            }
        }

        // Traverse from 9 down to 0 to find the two largest digits
        int count = 0;
        for (int i = 9; i >= 0; i--) {
            if (seen[i]) {
                count++;
                if (count == 2) {
                    return i;  // Second largest found
                }
            }
        }

        return -1;  // Less than 2 unique digits


    }
    public static void main(String[] args) {
        
    }
}
