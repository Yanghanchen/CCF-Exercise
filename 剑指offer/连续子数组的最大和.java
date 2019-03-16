public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int n=array.length;
        int[] dp=new int[n];
        dp[0]=array[0];
        for(int i=1;i<n;i++){
            if(dp[i-1]>0)
                dp[i]=Math.max(array[i],dp[i-1]+array[i]);
            else
                dp[i]=Math.max(array[i],dp[i-1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i:dp){
            max=max<i?i:max;
        }
        return max;
    }
}