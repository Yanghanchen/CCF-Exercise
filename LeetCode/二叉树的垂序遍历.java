class Solution {
    Comparator<int[]> comparator=new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o2[1]==o1[1]?o1[0]-o2[0]:o2[1]-o1[1];
        }
    };
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Map<Integer,ArrayList<int[]>> nodes=new TreeMap<>();
        dfs(root,0,0,nodes);
        ArrayList<List<Integer>> result=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<int[]>> e:nodes.entrySet()){
            ArrayList<int[]> value=e.getValue();
            Collections.sort(value,comparator);
            ArrayList<Integer> tmp=new ArrayList<>();
            for(int[] a:value){
                tmp.add(a[0]);
            }
            result.add(tmp);
        }
        return result;
    }

    private void dfs(TreeNode root, int x, int y, Map<Integer, ArrayList<int[]>> nodes) {
        if(root!=null){
            if(nodes.get(x)!=null){
                nodes.get(x).add(new int[]{root.val,y});
            }else{
                ArrayList<int[]> tmp=new ArrayList<>();
                tmp.add(new int[]{root.val,y});
                nodes.put(x,tmp);
            }
            dfs(root.left,x-1,y-1,nodes);
            dfs(root.right,x+1,y-1,nodes);
        }
    }
}