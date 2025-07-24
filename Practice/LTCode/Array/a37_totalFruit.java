// 904. Fruit Into Baskets

import java.util.HashMap;

public class a37_totalFruit {

    public int totalFruit(int[] fruits) {
        //brute force approch O(n^2)
        // int maxLen = 0;
        // for(int i=0; i<fruits.length; i++) {
        //     HashSet<Integer>s = new HashSet<>();
        //     for(int j=i;  j<fruits.length; j++) {
        //         s.add(fruits[j]);
        //             if(s.size()<=2) {
        //                 maxLen = Math.max(maxLen,j-i+1);
        //             }
        //             else {
        //                 break;
        //             }
        //         }
        // }
        // return maxLen;
        //optimize O(n)

        int l = 0;
        int r = 0;
        int maxLen = 0;
        HashMap<Integer,Integer>s = new HashMap<>();

        while(r<fruits.length) {
            s.put(fruits[r],s.getOrDefault(fruits[r], 0) + 1);
            if(s.size()>2) {
                while(s.size()>2) {
                    s.put(fruits[l], s.getOrDefault(fruits[l], 0) - 1);
                    if(s.get(fruits[l]) == 0) {
                        s.remove(fruits[l]);
                    }
                    l++;
                }
            }
            if(s.size()<=2) {
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}
