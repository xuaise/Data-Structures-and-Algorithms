package meituan;

public class Atoi {
    public int myAtoi(String str){
        str = str.trim();
        int res = 0;
        int i = 0;
        boolean flag = false;
        if(str==null||str.equals("")) return 0;
        if(str.charAt(i) == '-') {flag = true; res = -0;}
        if(str.charAt(i) == '-'||str.charAt(i) == '+'){
            i++;
        }
        while (i<str.length()&& Character.isDigit(str.charAt(i))){
            int num = str.charAt(i)-'0';
            if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE/10&&num>7){
                return Integer.MAX_VALUE;
            }
            else if(res<Integer.MIN_VALUE/10||res==Integer.MIN_VALUE/10&&num>8){
                return Integer.MIN_VALUE;
            }
            if(res>=0&&!flag){
                res = res*10+num;
            }
            else if(res<=0&&flag){
                res = res*10-num;
            }
            i++;
        }
        return res;
    }
}
