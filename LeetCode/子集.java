class Solution {
    ArrayList<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList());
        if(nums.length==0){
            return result;
        }
        for(int i:nums){
            int n=result.size();
            for(int j=0;j<n;j++){
                List<Integer> subset=result.get(j);
                ArrayList<Integer> nsub=new ArrayList<>(subset);
                nsub.add(i);
                Collections.sort(nsub);
                if(!result.contains(nsub)){
                    result.add(nsub);
                }
            }
        }
        return result;
    }
}