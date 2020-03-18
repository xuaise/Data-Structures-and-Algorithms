package 动态规划;

/**
 * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 */
public class leetcode44 {
    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        int sIdx = 0, pIdx = 0;
        int starIdx = -1, sTmpIdx = -1;

        while (sIdx < sLen) {

            if (pIdx < pLen && (p.charAt(pIdx) == '?' || p.charAt(pIdx) == s.charAt(sIdx))){
                ++sIdx;
                ++pIdx;
            }

            else if (pIdx < pLen && p.charAt(pIdx) == '*') {

                starIdx = pIdx;
                sTmpIdx = sIdx;
                ++pIdx;
            }

            else if (starIdx == -1) {
                return false;
            }

            else {

                pIdx = starIdx + 1;
                sIdx = sTmpIdx + 1;
                sTmpIdx = sIdx;
            }
        }


        for(int i = pIdx; i < pLen; i++)
            if (p.charAt(i) != '*') return false;
        return true;
    }
}
