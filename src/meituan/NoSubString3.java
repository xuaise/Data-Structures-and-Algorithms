package meituan;

import java.util.HashMap;
import java.util.HashSet;

public class NoSubString3 {
    public int lengthOfLongestSubstring(String s) {
        int rlength = 0;
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length;i++){
            int len = 0;
            for(int j=i;j<chars.length;j++){
                if(set.contains(chars[j])){
                    set.clear();
                    break;
                }
                else{
                    len++;
                    set.add(chars[j]);
                }
            }
            if(len>rlength){
                rlength = len;
            }
        }
        return rlength;
    }

    public int lengthOfLongestSubstring2(String s){
        int rlength = 0;
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0,j = 0;i<chars.length;i++){
            if(map.containsKey(chars[j])){
                i = Math.max(i,map.get(chars[j]));
            }
            rlength =Math.max(rlength,j-i+1);
            map.put(chars[j],j);
        }
       return rlength;
    }
}
