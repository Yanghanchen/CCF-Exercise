public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        return Math.abs(getDepth(root.left)-getDepth(root.right))<=1?true:false;
    }

    private int getDepth(TreeNode node) {
        if(node==null){
            return 0;
        }else{
            return Math.max(1+getDepth(node.left),1+getDepth(node.right));
        }
    }
}