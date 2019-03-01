class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        if(matrix.length==0||matrix[0].length==0){
            return flag;
        }
        loop:
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][matrix[i].length-1]){
                for(int j=0;j<matrix[i].length;j++){
                    if(target==matrix[i][j]){
                        flag=true;
                        break loop;
                    }
                }
            }
        }
        return flag;
    }
}