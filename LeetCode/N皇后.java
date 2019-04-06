class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> result=new ArrayList<>();
        if(n!=0){
            boolean[][] set=new boolean[n][n];
            solveNQueens(0,n,result,set);
        }
        return result;
    }

    private void solveNQueens(int row, int n, ArrayList<List<String>> result, boolean[][] set) {
        if(row==n){
            ArrayList<String> tmp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (set[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                tmp.add(sb.toString());
            }
            result.add(tmp);
        }else{
            for(int i=0;i<n;i++){
                if(check(row,i,set)){
                    continue;
                }
                set[row][i]=true;
                solveNQueens(row+1,n,result,set);
                set[row][i]=false;
            }
        }
    }

    private boolean check(int row, int col, boolean[][] set) {
        for(int i=0;i<set.length;i++){
            if(set[row][i]||set[i][col]){
                return true;
            }
        }
        int r=row,c=col;
        while(r>=0&&c>=0){
            if(set[r--][c--]){
                return true;
            }
        }
        r=row;
        c=col;
        while(r<set.length&&c<set.length){
            if(set[r++][c++]){
                return true;
            }
        }
        r=row;
        c=col;
        while(r>=0&&c<set.length){
            if(set[r--][c++]){
                return true;
            }
        }
        r=row;
        c=col;
        while(r<set.length&&c>=0){
            if(set[r++][c--]){
                return true;
            }
        }
        return false;
    }
}