// 1720. Decode XORed Array

public class m27_decode {
     public int[] decode(int[] encoded, int first) {

        // a ^ b = c then b = c ^ a 

        int[] arr = new int[encoded.length + 1];

        arr[0] = first;

        for(int i=0 ; i<encoded.length ; i++){
            arr[i+1] = encoded[i] ^ first;
            first = arr[i+1];
        }

        return arr;
        
    }
    public static void main(String[] args) {
        
    }
}
