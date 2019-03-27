class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root!=null){
            Stack<TreeNode> stack=new Stack<>();
            while(root!=null||!stack.empty()){
                while(root!=null){
                    stack.push(root);
                    root=root.left;
                }
                root=stack.pop();
                result.add(root.val);
                root=root.right;
            }
        }
        return result;
    }
}