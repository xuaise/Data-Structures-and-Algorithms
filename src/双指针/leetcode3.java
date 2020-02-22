package 双指针;

import java.util.HashMap;
import java.util.Map;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0,j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=j+1;
            }
                ans = Math.max(ans,j-i+1);
                map.put(s.charAt(i),i );


        }
        return ans;
    }
}
