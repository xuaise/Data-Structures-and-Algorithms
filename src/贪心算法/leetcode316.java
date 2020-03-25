package 贪心算法;

import java.util.Stack;

public class leetcode316 {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }


        boolean[] set = new boolean[26];

        int[] lastAppearIndex = new int[26];
        for (int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        stack.push('a');

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (set[currentChar - 'a']) {
                continue;
            }

            while (stack.peek() > currentChar && lastAppearIndex[stack.peek() - 'a'] >= i) {
                char top = stack.pop();
                set[top - 'a'] = false;
            }

            stack.push(currentChar);
            set[currentChar - 'a'] = true;
        }

        int size = stack.size();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.insert(0, stack.pop());
        }
        return stringBuilder.toString();
    }
}
