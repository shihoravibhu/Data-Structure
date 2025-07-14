// 119.Pascal Triangle 2

import java.util.ArrayList;
import java.util.List;

public class a14_PascalTriangle_2 {

      public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (i == j || j == 0) { // First and last elements are always 1
                    row.add(1);
                } else { // sum 
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
    public static void main(String[] args) {
        
    }
}
