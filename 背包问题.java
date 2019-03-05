public class Solution {
    //0-1背包：动态规划法
    public int zeroOnePackage(List<int[]> data,int limit) {
        int n = data.size();
        int[] dp = new int[limit+1];
        for(int i=0;i<n;i++){
            int[] item = data.get(i);
            int weight = item[0];
            int value = item[1];
            for(int j=limit;j>=0;j--){
                if(item[0]<=j){
                    dp[j] = Math.max(dp[j],dp[j-weight]+value);
                }
            }
        }
        return dp[limit];
    }
    //分数背包：贪心法
    public int centPackage(List<int[]> data,int limit) {
        int maxValue = 0,result = 0,maxIndex = 0;
        while(limit>0){
            for(int i=0;i<data.size();i++){
                int[] item = data.get(i);
                int weight = item[0];
                int value = item[1];
                if(value/weight>maxValue){
                    maxIndex = i;
                    maxValue = value/weight;
                }
            }
            int[] maxItem = data.get(maxIndex);
            int weight = maxItem[0];
            int value = maxItem[1];
            if(limit<weight){
                result+=((value*limit)/weight);
                limit=0;
            }else{
                result+=value;
                limit-=weight;
                data.remove(maxIndex);
                maxValue=0;
            }
        }
        return result;
    }
}