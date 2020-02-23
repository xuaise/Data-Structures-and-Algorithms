package 贪心算法;

public class Leetcode392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int j = 0;
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j == s.length()){
                    return true;
                }
            }

        }
        return false;
    }
}
