// 118.Pascal Triangle

import java.util.ArrayList;
import java.util.List;

public class a13_PascalTriangle{

   public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0 ; i<numRows ; i++){

            List<Integer> row = new ArrayList<>();

            for(int j=0 ; j<=i ; j++){

                if(i==j || j==0){       // First and last elements are always 1
                    row.add(1);
                }
                else{           // sum 
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
        
    }
    public static void main(String[] args) {
        
    }
}