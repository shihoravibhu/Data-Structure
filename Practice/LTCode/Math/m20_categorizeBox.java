// 2525. Categorize Box According to Criteria

public class m20_categorizeBox {
     public String categorizeBox(int length, int width, int height, int mass) {
        
//         The box is "Bulky" if:
// Any of the dimensions of the box is greater or equal to 104.
// Or, the volume of the box is greater or equal to 109.

// If the mass of the box is greater or equal to 100, it is "Heavy".      

    boolean bulky = false;
    boolean heavy = false;

    long vol = (long)length * width * height;
    // or
    // long vol = 1L * length * width * height;

    if(length >= 10000 || width >= 10000 || height >= 10000 || vol >= 1000000000){
       bulky = true;
    }

    if(mass >= 100){
        heavy = true;
    }

   if(bulky && heavy) return "Both";

   else if(bulky) return "Bulky";

    else if(heavy) return "Heavy";

    else return "Neither";

    }
    public static void main(String[] args) {
        
    }
}
