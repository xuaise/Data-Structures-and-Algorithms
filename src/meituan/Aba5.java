package meituan;

public class Aba5 {
    public String longestPalindrome(String s) {
        if(s.equals("")) return "";
        char[] chars = s.toCharArray();
        int n = chars.length;
        int end = 0;int start = 0;
        for(int i = 0;i<n;i++){
            int len1 = sub(chars,i,i);
            int len2 = sub(chars,i,i+1);
            int len  = Math.max(len1,len2);
            if(end-start<len){
                end = i+len/2;
                start = i-(len-1)/2;
            }
        }
        return new String(chars,start,end-start+1);
    }
    public int sub(char[] chars,int l ,int r){

        while(r<chars.length&&l>=0&&chars[l] == chars[r]){
            l--;
            r++;
        }
        return r-l-1;
    }
}
