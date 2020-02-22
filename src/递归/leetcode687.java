package 递归;

/**
 *
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *                5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 *
 *           返回：2
 */

class TreeNode{
    TreeNode left ;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
}
public class leetcode687 {
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = arrowLength(root.left);
        int right = arrowLength(root.right);
        int arrowleft = 0;int arrowRight = 0;
        if(root.left!=null&&root.left.val == root.val){
            arrowleft=left+1;
        }
        if(root.right!=null&&root.right.val == root.val){
            arrowRight=right+1;
        }
        ans = Math.max(ans,arrowleft+arrowRight);
        return Math.max(arrowRight,arrowleft);
    }
}
