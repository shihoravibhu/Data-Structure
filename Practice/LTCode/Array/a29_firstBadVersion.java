// 278. First Bad Version

public class a29_firstBadVersion {

     public int firstBadVersion(int n) {

        int st = 1 , en = n ;

        while(st < en){
            // int mid = st + (en-st)/2;

            // if(isBadVersion(mid)){ // jo version bad mid ma nathi to eni pela pan nai j hoi karn k jya thi bad version avse tena pachi na j badha bad version vada hase
            //     en = mid;  // mid could be the first bad, keep i
            // }
            // else{
            //     st = mid+1;  // mid is not bad  
            // }
        }
        return st;
    }
    public static void main(String[] args) {
        
    }
}
