class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder!=null&&preorder.length!=0) {
            TreeNode result = bstFromPreorder(preorder,0,preorder.length);
            return result;
        }
        return null;
    }

    private TreeNode bstFromPreorder(int[] preorder, int start, int end) {
        if(start<end-1){
            TreeNode root=new TreeNode(preorder[start]);
            for (int i=start+1; i < end; i++) {
                if (preorder[i] > preorder[start]) {
                    root.left=bstFromPreorder(preorder, start+1, i);
                    root.right=bstFromPreorder(preorder,i,end);
                    break;
                }else if(preorder[i]<preorder[start]&&i==end-1){
                    root.left=bstFromPreorder(preorder, start+1, i+1);
                }
            }
            return root;
        }else if(start==end-1){
            return new TreeNode(preorder[start]);
        }
        return null;
    }
}