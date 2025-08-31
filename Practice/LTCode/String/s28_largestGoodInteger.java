// 2264. Largest 3-Same-Digit Number in String

public class s28_largestGoodInteger {
      public String largestGoodInteger(String num) {

        String[] nums = {"999","888","777","666","555","444","333","222","111","000"};

        for(String n : nums){

            if(num.contains(n)){
                return n;
            }
        }

        return "";

        
    }
    public static void main(String[] args) {
        
    }
}
