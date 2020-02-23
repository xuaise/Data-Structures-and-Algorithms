package 贪心算法;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals,(n1,n2)->n1[0]-n2[0]);
        int count=0;
        int prev = 0;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[prev][1]>intervals[i][0]){
                if(intervals[prev][1]>intervals[i][1])
                prev = i;
                count++;
            }
            else{
                prev = i;
            }
        }
        return count;
    }
}
