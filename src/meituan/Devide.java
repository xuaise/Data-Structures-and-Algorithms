package meituan;

public class Devide {
    public int divide(int dividend, int divisor) {
        int negtive=0;
        int flag=0;
        if((dividend^divisor) <0) negtive=-1;
        if(dividend==-2147483648 && divisor==1)return -2147483648;
        if(dividend==-2147483648 && divisor==-1) return 2147483647;
        if(dividend==-2147483648){
            dividend=2147483647;
            flag=1;
        }
        if(dividend<0)dividend=-dividend;
        if(divisor<0)divisor=-divisor;
        int ret=0;
        int count=1;
        int tempdivisor=divisor;
        while(dividend-divisor>=0){
            ret+=count;
            dividend=dividend-tempdivisor;
            if(dividend>tempdivisor+tempdivisor){
                count +=count;
                tempdivisor+=tempdivisor;
            }else{
                count=1;
                tempdivisor=divisor;
            }
        }
        if(flag==1){
            ret=ret+((dividend+1==divisor)?1:0);
        }
        return negtive==0?ret:-ret;
    }
}
