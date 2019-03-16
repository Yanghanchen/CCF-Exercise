public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        FindPath(root,target,result,new ArrayList<>());
        return result;
    }

    private void FindPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> result,ArrayList<Integer> tmp) {
        if (root.val==target&&root.left==null&&root.right==null){
            tmp.add(root.val);
            result.add(tmp);
        }else{
            if(root.val>target){
                return;
            }else{
                tmp.add(root.val);
                if(root.left!=null)
                    FindPath(root.left,target-root.val,result,new ArrayList<>(tmp));
                if(root.right!=null)
                    FindPath(root.right,target-root.val,result,new ArrayList<>(tmp));
            }
        }
    }
}