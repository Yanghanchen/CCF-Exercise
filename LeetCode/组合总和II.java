class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> tmp=new ArrayList<>();
        if(candidates!=null&&candidates.length!=0){
            Arrays.sort(candidates);
            combinationSum(candidates,target,result,tmp,0);
        }
        return result;
    }

    private void combinationSum(int[] candidates, int target, ArrayList<List<Integer>> result, ArrayList<Integer> tmp,int j) {
        if(target==0&&!result.contains(tmp)){
            result.add(tmp);
        }else if(j<candidates.length&&target>=candidates[j]){
            for(int i=j;i<candidates.length&&candidates[i]<=target;i++){
                ArrayList<Integer> list=new ArrayList<>(tmp);
                list.add(candidates[i]);
                combinationSum(candidates,target-candidates[i],result,list,i+1);
            }
        }
    }
}