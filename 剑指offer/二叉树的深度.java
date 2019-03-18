public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            if(root.left==null){
                return 1+TreeDepth(root.right);
            }else if(root.right==null){
                return 1+TreeDepth(root.left);
            }else{
                return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
            }
        }
    }
}