public class Solution {
    TreeNode last=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        TreeNode left=Convert(pRootOfTree.left);
        pRootOfTree.left=last;
        if(last!=null){
            last.right=pRootOfTree;
        }
        last=pRootOfTree;
        TreeNode right=Convert(pRootOfTree.right);
        if(right!=null){
            right.left=pRootOfTree;
        }
        return left==null?pRootOfTree:left;
    }
}