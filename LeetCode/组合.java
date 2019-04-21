class Solution {
    ArrayList<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n==0||k==0){
            return new ArrayList<>();
        }
        dfs(n,k,new ArrayList<>());
        return result;
    }

    private void dfs(int n, int k,ArrayList<Integer> tmp) {
        if(tmp.size()==k){
            Collections.sort(tmp);
            if(!result.contains(tmp)){
                result.add(tmp);
            }
        }else if(tmp.size()<k){
            int start;
            if(tmp.isEmpty()){
                start=1;
            }else{
                start=tmp.get(tmp.size()-1)+1;
            }
            for(int i=start;i<=n;i++){
                ArrayList<Integer> ntmp=new ArrayList<>(tmp);
                ntmp.add(i);
                dfs(n,k,ntmp);
            }
        }
    }
}