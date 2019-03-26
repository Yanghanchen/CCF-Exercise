class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix!=null&&matrix.length!=0&&matrix[0].length!=0) {
            int m = matrix.length;
            int n = matrix[0].length;
            int i=0,j=0,index=0;
            int state=0;
            boolean[][] flags=new boolean[m][n];
            while (index < m*n){
                result.add(matrix[i][j]);
                flags[i][j]=true;
                switch (state%4){
                    case 0:{
                        if(j<n-1&&!flags[i][j+1]) {
                            j++;
                        }else{
                            //j=n-1
                            i++;
                            state++;
                        }
                    }break;
                    case 1:{
                        if(i<m-1&&!flags[i+1][j]) {
                            i++;
                        }else{
                            //i=n-1
                            j--;
                            state++;
                        }
                    }break;
                    case 2:{
                        if(j>0&&!flags[i][j-1]) {
                            j--;
                        }else{
                            //j=0
                            i--;
                            state++;
                        }
                    }break;
                    case 3:{
                        if(i>0&&!flags[i-1][j]) {
                            i--;
                        }else{
                            //i=0
                            j++;
                            state++;
                        }
                    }break;
                }
                index++;
            }
        }
        return result;
    }
}