// 504. Base 7

public class m22_convertToBase7 {
    public String convertToBase7(int num) {

        // 100 ÷ 7 = 14 remainder 2
        // 14 ÷ 7 = 2  remainder 0
        // 2 ÷ 7 = 0  remainder 2

        // have ano ans undhethi jovano apde df ma base 7 kai rite find karta ee rite j same 

        // so niche thi jota (reverse karta) ans : 202

        if(num == 0){       //Base Case
            return "0";
        }
        
        StringBuilder sb  = new StringBuilder();

        boolean isnegative = false;

        if(num < 0){
            num = -num;
            isnegative = true;
        }

        while(num != 0){
            sb.append(num % 7);
            num /= 7;
        }

        if(isnegative){
            return "-"+sb.reverse().toString();
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        
    }
}
