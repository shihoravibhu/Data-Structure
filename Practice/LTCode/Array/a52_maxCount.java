public class a52_maxCount {

    static public int maxCount(int m, int n, int[][] ops) {

        int[][] arr = new int[m][n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){

                for(int k=0 ; k<ops[0].length ; k++){

                if(arr[i][j] == ops[0][k]){
                    arr[i][j] += 1;
                }
                }
            }
        }

        return 0;
        
    }
    public static void main(String[] args) {

        int[][] ops = new int[][]{{1,2},
                                  {3,4},
                                {5,6}};

        System.out.println(ops[2][1]);

    }
}
