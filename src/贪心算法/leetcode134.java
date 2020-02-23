package 贪心算法;

public class leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr_tank = 0;
        int total_tank = 0;
        int station = 0;
        for(int i = 0;i<gas.length;i++){
            total_tank += gas[i]-cost[i];
            curr_tank += gas[i]-cost[i];
            if(curr_tank<0){
                station = i+1;
                curr_tank = 0;
            }
        }
        return total_tank>=0?station:-1;
    }
}
