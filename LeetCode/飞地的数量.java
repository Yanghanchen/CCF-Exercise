class Solution {
    public int numEnclaves(int[][] A) {
        if(A==null||A.length==0||A[0].length==0){
            return 0;
        }
        for(int i=0;i<A[0].length;i++){
            if(A[0][i]==1){
                dfs(A,0,i);
            }
            if(A[A.length-1][i]==1){
                dfs(A,A.length-1,i);
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i][0]==1){
                dfs(A,i,0);
            }
            if(A[i][A[0].length-1]==1){
                dfs(A,i,A[0].length-1);
            }
        }
        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] A, int i, int j) {
        A[i][j]=0;
        if(i<A.length-1&&A[i+1][j]==1){
            dfs(A,i+1,j);
        }
        if(i>0&&A[i-1][j]==1){
            dfs(A,i-1,j);
        }
        if(j<A[0].length-1&&A[i][j+1]==1){
            dfs(A,i,j+1);
        }
        if(j>0&&A[i][j-1]==1){
            dfs(A,i,j-1);
        }
    }
}