package 贪心算法;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode253 {
    public int minMeetingRooms1(int[][] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] n1,int[] n2) {
                return n1[0]-n2[0];
            }
        });
        int n = intervals.length;
        PriorityQueue<Integer> allocator = new PriorityQueue<>(n, (o1, o2) -> o1-o2);
        allocator.add(intervals[0][1]);
        for(int i = 1;i<n;i++){
            if(intervals[i][0]>=allocator.peek()){
                allocator.poll();
            }
            allocator.add(intervals[i][1]);
        }
        return allocator.size();
    }


    public int minMeetingRooms2(int[][] intervals){
        if(intervals == null){
            return 0;
        }
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0;i<n;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int startPointer = 0;int endPointer = 0;
        int size = 0;
        while (startPointer<n){
            if(start[startPointer]>=end[endPointer]){
                size--;
                endPointer++;
            }

            size++;

            startPointer++;
        }
        return size;
    }
}
