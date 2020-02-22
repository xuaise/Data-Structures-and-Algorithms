package 递归;

public class leetcode625 {
    public int smallestFactorization(int a) {
        if(a<2){
            return a;
        }
        long i = 1;
        long res = 0;
        for(int k = 9;k>=2;k--){
            while (a%k==0){
                a = a/k;
                res=res+k*i;
                i*=10;
            }
        }
        return a<2&&res<=Integer.MAX_VALUE?(int)res:0;
    }
}
