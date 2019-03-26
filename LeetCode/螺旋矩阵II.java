class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];

        int value=1,i=0,j=0;
        int state=0;
        for(;value<=n*n;value++){
            result[i][j]=value;
            switch (state%4){
                case 0:{
                    if(j<n-1&&result[i][j+1]!=0){
                        i++;
                        state++;
                    }else if(j<n-1&&result[i][j+1]==0){
                        j++;
                        if(j==n-1){
                            state++;
                        }
                    }
                }break;
                case 1:{
                    if(i<n-1&&result[i+1][j]!=0){
                        j--;
                        state++;
                    }else if(i<n-1&&result[i+1][j]==0){
                        i++;
                        if(i==n-1){
                            state++;
                        }
                    }
                }break;
                case 2:{
                    if(j>0&&result[i][j-1]!=0){
                        i--;
                        state++;
                    }else if(j>0&&result[i][j-1]==0){
                        j--;
                        if(j==0){
                            state++;
                        }
                    }
                }break;
                case 3:{
                    if(i>0&&result[i-1][j]!=0){
                        j++;
                        state++;
                    }else if(i>0&&result[i-1][j]==0){
                        i--;
                        if(i==0){
                            state++;
                        }
                    }
                }break;
            }
        }
        return result;
    }
}