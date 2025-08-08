// 412. Fizz Buzz

import java.util.ArrayList;
import java.util.List;

public class m21_fizzBuzz {
     public List<String> fizzBuzz(int n) {

        List<String> li = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){

            if(i % 15 == 0){
                li.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                li.add("Fizz");
            }
            else if(i % 5 == 0){
                li.add("Buzz");
            }
            else{
                li.add(i+"");
            }
        }

        return li;
        
    }
    public static void main(String[] args) {
        
    }
}
