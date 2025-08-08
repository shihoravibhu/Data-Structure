// 2535. Difference Between Element Sum and Digit Sum of an Array

 class m18_differenceOfSum {
     public int differenceOfSum(int[] nums) {

        int sumEle = 0;

        for(int num : nums){
            sumEle += num;
        }

        int sumDigit = 0;

        for(int num : nums){

            while(num != 0){
                sumDigit += num % 10;
                num = num / 10;
            }
        }

        return Math.abs(sumEle - sumDigit);
        
    }
    public static void main(String[] args) {
        
    }
}
