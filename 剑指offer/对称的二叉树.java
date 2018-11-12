public class Solution {
    public boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null)
            return true;
        return isJingxiang(pRoot.left,pRoot.right);
    }
     
    public boolean isJingxiang(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
         
        if (t1 != null && t2 != null)
            return t1.val == t2.val && isJingxiang(t1.left,t2.right) && isJingxiang(t1.right, t2.left);
        return false;
    }
}