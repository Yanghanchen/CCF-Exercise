class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        if(days==null||days.length==0||costs==null||costs.length<3){
            return 0;
        }
        int n=days[days.length-1];
        int[] dp=new int[n+1];
        dp[0]=0;
        int dIndex=0;
        for(int i=1;i<n+1;i++){
            if(days[dIndex]!=i){
                dp[i]=dp[i-1];
            }else{
                dp[i]=Math.min(dp[Math.max(0,i-1)]+costs[0],Math.min(dp[Math.max(0,i-7)]+costs[1],dp[Math.max(0,i-30)]+costs[2]));
                dIndex++;
            }
        }
        return dp[n];
    }
}