public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    public TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(pre[preStart]);
        for(int i=0;i<in.length;i++){
            if(in[i]==root.val){
                root.left=reConstructBinaryTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                root.right=reConstructBinaryTree(pre,preStart+i+1-inStart,preEnd,in,i+1,inEnd);
            }
        }
        
        return root;
    }