// 2206. Divide Array Into Equal Pairs

import java.util.HashSet;

public class a19_Divide_Into_Equal_Pairs {

    public boolean divideArray(int[] nums) {
        
        HashSet<Integer> s = new HashSet<>();

        for(int i:nums){
            if(s.contains(i)){
                s.remove(i);
            }
            else{
                s.add(i);
            }
        }

        return s.size() == 0;

    }
    public static void main(String[] args) {
        
    }
}
