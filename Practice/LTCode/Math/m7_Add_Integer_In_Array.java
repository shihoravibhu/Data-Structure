// 989. Add to Array-Form of Integer

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class m7_Add_Integer_In_Array {

      public List<Integer> addToArrayForm(int[] num, int k) {

    //     int sum = 0 , n = num.length;

    //   for(int i = 0 ; i < n ; i++){
    //         sum += num[i] * Math.pow(10,n-i-1);
    //     }

    //     sum+=k;

    //     int n2 = Integer.toString(Math.abs(sum)).length();

    //     num = new int[n2];

    //     int i=0 ;

    //     while(sum!=0){
    //         num[i] = sum % 10;
    //         sum = sum / 10;
    //         i++;
    //     }

    //     List<Integer> list = new ArrayList<>();

    //     for(i = n2 - 1; i >= 0 ; i--){
    //         list.add(num[i]);
    //     }

    //     return list;     // problem when n and k is bigger value


    // or

    int i = num.length - 1;

    LinkedList<Integer> li= new LinkedList<>();

    while(i>=0 || k>0){
        if(i>=0){
            k+=num[i];
            i--;
        }
        li.addFirst(k%10);        // addfirst addfirst etle agal agal add thato jase element
        k = k/10;

    }

    return li;
   
        
    }
    public static void main(String[] args) {

//         int[] num ={2,1,5};

//          int sum = 0 , n = num.length , k=806;

//          for(int i = 0 ; i < n ; i++){
//             sum += num[i] * Math.pow(10,n-i-1);
//         }

//         sum += k;

//         // System.out.println(sum);
//         int n2 = Integer.toString(Math.abs(sum)).length();

//         num = new int[n2];

//         int i=0;

//          while(sum!=0){
//             num[i] = sum % 10;
//             sum = sum / 10;
//             i++;
//         }
      
//  List<Integer> li = new ArrayList<>();

//         for(i = n2 - 1; i >= 0 ; i--){
//             li.add(num[i]);
//         }

//         for(i = 0; i < n2 ; i++){
           
//             System.out.println( li.get(i));
//         }

        // System.out.println(Arrays.toString(num));
    }
}
