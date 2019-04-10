class Solution {
    public int lenLongestFibSubseq(int[] A) {
        if(A.length<3){
            return 0;
        }
        int n=A.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=2;
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],i);
        }
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[i]<A[j]*2&&map.get(A[i]-A[j])!=null){
                    dp[i][j]=dp[j][map.get(A[i]-A[j])]+1;
                    result=Math.max(dp[i][j],result);
                }
            }
        }
        return result;
    }
}