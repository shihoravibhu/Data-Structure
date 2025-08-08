// 3477. Fruits Into Baskets II

public class a55_numOfUnplacedFruits {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        int n = fruits.length ;   // ahiya fruits no order matter kare che so apde tene sort nai kari sakiye 
        int unplaced = 0;
        boolean[] isUsed = new boolean[n];       

        for(int f : fruits){

            boolean placed = false;

            for(int j=0 ; j<n ; j++){

            if(f <= baskets[j] && !isUsed[j]){
                isUsed[j] = true;
                placed = true;
                break;                
            }

            }

            if(!placed){
                unplaced++;
            }
        }

        return unplaced;

       
    }
    public static void main(String[] args) {
        
    }
}
