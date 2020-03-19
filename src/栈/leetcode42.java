package 栈;

import java.util.Stack;

/**
 * 栈时间复杂度o(n) 空间复杂度o(n)
 *
 * 双指针时间复杂度o(n) 空间复杂度o(1)
 */
public class leetcode42 {
    public int trap(int[] height) {
        int ans = 0;int current = 0;
        Stack<Integer> st = new Stack();
        while (current < height.length) {
            while (!st.empty() && height[current] > height[st.peek()]) {
                int top = st.pop();
                st.peek();
                if (st.empty())
                    break;
                int distance = current - st.peek() - 1;
                int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;
    }
}
