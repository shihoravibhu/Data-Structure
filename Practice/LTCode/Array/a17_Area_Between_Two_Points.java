//1637. Widest Vertical Area Between Two Points Containing No Points

import java.util.Arrays;

public class a17_Area_Between_Two_Points {
    
     public int maxWidthOfVerticalArea(int[][] arr) {

        int n = arr.length;

        if (n < 2) {
            return 0;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); // sort by first element
            } else {
                return Integer.compare(a[1], b[1]); // if equal, sort by second element
            }
        }); // For sorting like this 
        // 7 4
        // 8 7
        // 9 7
        // 9 9

        //from

        //{8, 7},
        //{9, 9},
        //{7, 4},
        //{9, 7}

        int diff = 0;

        for (int i = 0; i < n - 1; i++) { // y fix che etle khali x (width) ne dhyan ma leta

            //  diff = Math.max(diff, arr[i + 1][0] - arr[i][0]);

            // or

            if (diff < (arr[i + 1][0] - arr[i][0])) {
                diff = arr[i + 1][0] - arr[i][0];
            }
        }

        return diff;
    }
    public static void main(String[] args) {
        
    }
}
