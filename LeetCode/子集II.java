class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        if(nums!=null){
            result.add(new ArrayList<>());
            if(nums.length!=0){
                Arrays.sort(nums);
                for(int i=1;i<=nums.length;i++){
                    subsetsWithDup(nums,i,0,result,new ArrayList<>());
                }
            }
        }
        return result;
    }

    private void subsetsWithDup(int[] nums, int limit, int start, ArrayList<List<Integer>> result, ArrayList<Integer> tmp) {
        if(tmp.size()==limit){
            Collections.sort(tmp);
            if(!result.contains(tmp)){
                result.add(new ArrayList<>(tmp));
            }
        }else{
            for(int i=start;i<nums.length;i++){
                ArrayList<Integer> list=new ArrayList<>(tmp);
                list.add(nums[i]);
                swap(nums,start,i);
                subsetsWithDup(nums,limit,i+1,result,list);
                swap(nums,start,i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}