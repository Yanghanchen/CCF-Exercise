class Solution {
    public int uniquePaths(int m, int n) {
        int[][] pathNum = new int[m+1][n+1];
        for(int i=0;i<=n;i++){
            pathNum[0][i]=0;
            pathNum[1][i]=1;
        }
        for(int i=0;i<=m;i++){
            pathNum[i][0]=0;
            pathNum[i][1]=1;
        }
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                pathNum[i][j] = pathNum[i-1][j]+pathNum[i][j-1];
            }
        }
        return pathNum[m][n];
    }
}