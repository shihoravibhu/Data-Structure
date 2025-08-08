// 598. Range Addition II

public class m24_maxCount {
    public int maxCount(int m, int n, int[][] ops) {

        int minrow = m;
        int mincoll = n;

        // For ex : ops = [[2,2],[3,3]]
        // The intersection of all such regions will contain the maximum value.
        //So the answer is simply the area of the smallest rectangle defined by all operations.
        // ahiya Because the overlapping region is 2x2 che so ans is 4 

        for(int op[] : ops){
            minrow = Math.min(minrow,op[0]);
            mincoll = Math.min(mincoll,op[1]);
        }
       return minrow * mincoll;
        
    }
    public static void main(String[] args) {
        
    }
}
