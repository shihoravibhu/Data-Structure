// 167. Two Sum II - Input Array Is Sorted

public class a48_twoSum {
     public int[] twoSum(int[] numbers, int target) {
        
        // int[] arr = new int[2];

        int st = 0 , en = numbers.length - 1;
        
        while(st < en){
           

            if(numbers[st] + numbers[en] == target){
            //     arr[0] = numbers[st];
            //     arr[1] = numbers[en];
            //    return arr;

               return new int[]{st+1,en+1};
            }
            else if(numbers[st] + numbers[en] < target){
               st++;              
            }
            else{
                en--;
            }
        }

        return new int[]{-1,-1};    // If no solution is found
    }
    public static void main(String[] args) {
        
    }
}
