package 动态规划;

public class leetcode91 {
    public int numDecodings(String s) {
        if(s == null||s.length() == 0){
            return 0;
        }

        if(s.charAt(0) == '0') return 0;
        int pre = 1;int curr = 1;
        int n = s.length();
        for(int i = 1;i<s.length();i++){
            int tmp = curr;
            if(s.charAt(i) == '0'){
                if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2')
                curr = pre;
                else
                    return 0;
            }
            else if (s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6'))
                curr = curr + pre;
            pre = tmp;
        }
        return  curr;
    }
}
