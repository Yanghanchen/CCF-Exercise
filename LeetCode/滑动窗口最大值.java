/*
    不依赖高级数据结构，但是性能不是最好的
    可以使用容量为k的优先队列
*/
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k) {
            return new int[] {};
        }
        int[] result=new int[nums.length-k+1];
        for(int i=0;i<result.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(nums[j]>max)
                    max=nums[j];
            }
            result[i]=max;
        }
        return result;
    }
}