import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length==1){
            for(int k=0;k<matrix[0].length;k++){
                list.add(matrix[0][k]);
            }
            return list;
        }
        if (matrix[0].length==1){
            for(int k=0;k<matrix.length;k++){
                list.add(matrix[k][0]);
            }
            return list;
        }
        int direction=0,i=0,j=0;
        for(int k=0;k<matrix.length*matrix[0].length;k++){
            list.add(matrix[i][j]);
            matrix[i][j]=-1;
            switch(direction){
                case 0:{
                    if(j+1<=matrix[i].length-1&&matrix[i][j+1]!=-1)
                        j++;
                    else {
                        direction = 1;
                        i++;
                    }
                }break;
                case 1:{
                    if(i+1<=matrix.length-1&&matrix[i+1][j]!=-1)
                        i++;
                    else {
                        direction = 2;
                        j--;
                    }
                }break;
                case 2:{
                    if(j-1>=0&&matrix[i][j-1]!=-1)
                        j--;
                    else {
                        direction = 3;
                        i--;
                    }
                }break;
                case 3:{
                    if(i-1>=0&&matrix[i-1][j]!=-1)
                        i--;
                    else {
                        direction = 0;
                        j++;
                    }
                }break;
            }
            if(matrix[i][j]==-1)
                break;
        }
        return list;
    }
}