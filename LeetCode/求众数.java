public class Solution {
    //方法一：摩尔投票法，遍历数组，遇到相同元素计数+1，不同元素-1，减到0时取下一个元素继续遍历
    public int majorityElement(int[] nums) {
        int temp=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp)
                count++;
            else{
                count--;
                if(count==0){
                    temp=nums[i+1];
                }
            }
        }
        return temp;
    }
    //方法二：排序，然后取中间元素 ———— 和方法一差不多
    //方法三：遍历计数存Map，然后找value大于n/2的 ———— 最慢
}