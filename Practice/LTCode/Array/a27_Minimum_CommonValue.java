// 2540. Minimum Common Value

public class a27_Minimum_CommonValue {
    
     public int getCommon(int[] nums1, int[] nums2) {

        int i=0 , j=0;      // Two Pointer Aproch
        
     while(i<nums1.length && j<nums2.length){

        if(nums1[i] == nums2[j]){
            return nums1[i];
        }
        else if(nums1[i] < nums2[j]){       // jo pela array ni value bija karta ochi che cho channce che k teni aglni value sarkhi hoi sake so i++
            i++;            
        }
        else{
            j++;
        }
     }
     return -1;
    }
    public static void main(String[] args) {
        
    }
}
