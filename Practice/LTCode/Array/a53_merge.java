// 56. Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class a53_merge {

     public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1){
            return intervals;
        }

        // sort array by ascending starting point
      Arrays.sort(intervals , Comparator.comparingInt(i -> i[0]));

      List<int[]> res = new ArrayList<>();

      int newInterval[] = intervals[0];
      res.add(newInterval);

      for(int interval[] : intervals){
        if(newInterval[1] >= interval[0]){      // etle k overlap thai che 
        // for ex. [1,3],[2,6] che to aa condition sachi padse and ahiya 3 and 6 mathi have motu 6 che to newInerval have [1,6] bani jase so 
            newInterval[1] = Math.max(newInterval[1],interval[1]);
            // ahiya apde modified newInterval ne pacho list ma nai add karvo pade karn k te internaly change thai jase by refrance(by array Address) so 
        }
        else{   //Overlap nathi thatu
            newInterval = interval;
            res.add(newInterval);
        }
      }

      return res.toArray(new int[res.size()][]);
        
    }
    public static void main(String[] args) {
        
    }
}
