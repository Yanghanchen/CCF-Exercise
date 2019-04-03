class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        if(root!=null){
            HashMap<Integer,List<TreeNode>> map=new HashMap<>();
            levelOrderBottom(root,0,map);
            for(int i=map.size()-1;i>=0;i--){
                List<TreeNode> valueSet=map.get(i);
                List<Integer> tmp=new ArrayList<>();
                for(TreeNode t:valueSet){
                    tmp.add(t.val);
                }
                result.add(tmp);
            }
        }
        return result;
    }

    private void levelOrderBottom(TreeNode root, int level, HashMap<Integer, List<TreeNode>> map) {
        if(root!=null) {
            if(map.get(level)!=null) {
                map.get(level).add(root);
            }else{
                ArrayList<TreeNode> tmp=new ArrayList<>();
                tmp.add(root);
                map.put(level,tmp);
            }
            levelOrderBottom(root.left,level+1,map);
            levelOrderBottom(root.right,level+1,map);
        }
    }
}