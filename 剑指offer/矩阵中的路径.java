public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(hasPath(matrix,rows,cols,str,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPath(char[] matrix, int rows, int cols, char[] str, int i, int j,int k) {
        if(i>=rows||j>=cols||i<0||j<0||matrix[i*cols+j]!=str[k]||matrix[i*cols+j]=='%')
            return false;
        else {
            if(k==str.length-1)
                return true;
            char temp=matrix[i*cols+j];
            matrix[i*cols+j]='%';
            if (hasPath(matrix, rows, cols, str,i - 1, j, k + 1)
                    || hasPath(matrix, rows, cols, str,i + 1, j, k + 1)
                    || hasPath(matrix, rows, cols, str,i, j - 1, k + 1)
                    || hasPath(matrix, rows, cols, str,i, j + 1, k + 1)) {
                return true;
            }
            matrix[i*cols+j] = temp;
            return false;
        }
    }
}