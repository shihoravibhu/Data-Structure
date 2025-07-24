public class b3_nextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int  start = 0,end = letters.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;
           
            if(letters[mid] <= target){
                start = mid + 1;   // move right
            }
            else{
                end = mid-1;     // move left
            }
        }

        // If all letters are <= target, wrap around to letters[0]
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        
    }
}
