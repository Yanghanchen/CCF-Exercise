import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }else if(p==null||q==null){
            return false;
        }else if(p.val==q.val){
            return isSymmetric(p.left,q.right)&&isSymmetric(p.right,q.left);
        }else{
            return false;
        }
    }
}