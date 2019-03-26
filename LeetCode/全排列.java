class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        if(nums!=null&&nums.length!=0){
            permute(nums,result,new ArrayList<>());
        }
        return result;
    }

    private void permute(int[] nums,ArrayList<List<Integer>> result, ArrayList<Integer> integers) {
        if(integers.size()==nums.length){
            result.add(new ArrayList<>(integers));
        }else{
            for(int i=0;i<nums.length;i++){
                if(integers.contains(nums[i]))
                    continue;
                integers.add(nums[i]);
                permute(nums,result,integers);
                integers.remove(integers.size()-1);
            }
        }
    }
}