class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null){
           root = new TreeNode(val);
       }
       else{
           if(root.val <= val){
               TreeNode temp = root;
               root = new TreeNode(val);
               root.left = temp;
           }
           else{
               root.right = insertIntoMaxTree(root.right, val);
           }
       }
       return root;      
   }
}