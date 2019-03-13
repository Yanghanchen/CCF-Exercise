public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }else{
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;
            if(root.left!=null){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }
    }
}