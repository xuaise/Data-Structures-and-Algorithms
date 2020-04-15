package meituan;

public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        String str = ""+x;
        if(str.charAt(0) == '-'){return false;}
        int left = 0;int right = str.length()-1;
        while (left<=right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
}
