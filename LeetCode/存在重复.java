class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0)
            return false;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length!=set.size()){
            return true;
        }else{
            return false;
        }
    }
}