// 1854. Maximum Population Year

public class a28_maximumPopulation {

      public int maximumPopulation(int[][] logs) {
        
        int MIN_YEAR = 1950; 
        int MAX_YEAR = 2050;

        int[] years = new int[MAX_YEAR - MIN_YEAR + 1];

        for(int i=0 ; i < logs.length ; i++){
            years[logs[i][0] - MIN_YEAR]++;
            years[logs[i][1] - MIN_YEAR]--;
        } 

        int res = 0;

        for(int i=1 ; i < years.length ; i++){

            years[i] += years[i-1];

            if(years[i] > years[res]){
                res = i;
            }
        }

        return res + MIN_YEAR;

    }
    public static void main(String[] args) {
        
    }
}
