package 贪心算法;

import java.util.LinkedList;

public class leetcode406 {
    public String removeKdigits(String num, int k) {
        if(num.length() == 0){return null;}
        LinkedList<Character> stack = new LinkedList<>();

        for(int i = 0;i<num.length();i++){
            while (stack.size() > 0 && k > 0 && stack.peekLast() > num.charAt(i)){
                stack.removeLast();
                k--;
            }
            stack.addLast(num.charAt(i));
        }

        for(int i = 0;i<k;i++){
            stack.removeLast();
        }
        StringBuilder res = new StringBuilder();
        boolean cflag = true;
        for(Character s:stack){
            if(cflag&&s == '0'){continue;}
            cflag = false;
            res.append(s);
        }
        if(res.length() == 0) {return "0";}
        return res.toString();
    }
}
