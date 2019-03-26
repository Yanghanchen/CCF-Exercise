class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        if(nums!=null&&nums.length!=0){
            permute(nums,result,new ArrayList<>());
        }
        return result;
    }

    private void permute(int[] nums,ArrayList<List<Integer>> result, ArrayList<Integer> integers) {
        if(integers.size()==nums.length){
            if(!result.contains(integers))
                result.add(new ArrayList<>(integers));
        }else{
            int n=integers.size();
            for(int i=n;i<nums.length;i++){
                integers.add(nums[i]);
                swap(nums,i,n);
                permute(nums,result,integers);
                swap(nums,i,n);
                integers.remove(integers.size()-1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}