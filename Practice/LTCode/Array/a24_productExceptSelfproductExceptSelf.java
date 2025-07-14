public class a24_productExceptSelfproductExceptSelf {

    public int[] productExceptSelf(int[] arr) {

        int[] pre = new int[arr.length];
        int[] sfix = new int[arr.length];       

        int n = arr.length;

        pre[0] = 1; 
        sfix[arr.length -1] = 1; 

        for(int i=1 ; i < n; i++){

         pre[i] = pre[i-1] * arr[i-1];
        }

        for(int i=n-2 ; i>=0 ; i--){
            sfix[i] = sfix[i+1] * arr[i+1];            
        }

        for(int i=0 ; i<n ; i++){
            arr[i] = pre[i] * sfix[i];
        }

        return arr;
        
    }
    public static void main(String[] args) {
        
    }
}
