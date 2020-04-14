package meituan;

public class NumRelease {
    public int reverse(int x) {
       int recv = 0;
       while (x!=0){
           int pop = x%10;
           x/=10;
           if(recv>Integer.MAX_VALUE/10||recv==Integer.MAX_VALUE/10&&pop>7){return 0;}
           if(recv<Integer.MIN_VALUE/10||recv==Integer.MIN_VALUE/10&&pop<8){return 0;}

           recv= recv*10+pop;
       }
       return recv;
    }
}
