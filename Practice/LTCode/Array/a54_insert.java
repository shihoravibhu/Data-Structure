// 57. Insert Interval

import java.util.Arrays;

public class a54_insert {
     public int[][] insert(int[][] intervals, int[] newInterval) {

        // ahiya already ascending order ma apel j che by strating point thi 
        // int[][] arr = new int[intervals.length + 1][2];

        // for(int i =0 ; i<intervals.length ; i++){
        //     arr[i] = intervals[i];            
        // }

        // arr[intervals.length] = newInterval;

        // Arrays.sort(arr,Comparator.comparingInt(i -> i[0]));
        
        // List<int[]> res = new ArrayList<>();

        // int ad[] = arr[0];

        // res.add(ad);

        // for(int interval[] : arr){

        //     if(ad[1] >= interval[0]){
        //         ad[1] = Math.max(ad[1],interval[1]);
        //     }
        //     else{
        //         ad = interval;
        //         res.add(ad);
        //     }
        // }

        // return res.toArray(new int[res.size()][]);

        // or (Optimize)

        int i=0 , j=0 , n=intervals.length;
        int[][] res = new int[n+1][2];

        // Add all intervals before newInterval (non-overlapping)
        while(i<n && intervals[i][1] < newInterval[0]){
            res[j++] = intervals[i++];
        }

        while(i<n && intervals[i][0] <= newInterval[1]){ // Merge overlapping intervals
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i++][1] , newInterval[1]);
        }

        res[j++] = newInterval; // Add the merged interval

        while(i<n){ // Add all remaining intervals
            res[j++] = intervals[i++];
        }

        return Arrays.copyOf(res,j); // Resize result to actual number of intervals
        // jo aa no kariye to last ma garbage je vadheli index che tema 0 avse 
    }
    public static void main(String[] args) {
        
    }
}
