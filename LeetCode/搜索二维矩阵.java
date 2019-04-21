class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int m=matrix.length,n=matrix[0].length;
        if(target<matrix[0][0]||target>matrix[m-1][n-1]){
            return false;
        }
        int a=0,b=m-1;
        while(a<=b){
            if(matrix[a][n-1]>=target){
                for(int i:matrix[a]){
                    if(i==target){
                        return true;
                    }
                }
                return false;
            }else if(matrix[b][0]<=target){
                for(int i:matrix[b]){
                    if(i==target){
                        return true;
                    }
                }
                return false;
            }else{
                a++;b--;
            }
        }
        return false;
    }
}