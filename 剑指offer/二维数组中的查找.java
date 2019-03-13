public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0){
            return false;
        }
        int row=0,col=array.length-1;
        while(row<array[0].length&&col>=0){
            if(array[row][col]==target){
                return true;
            }else if(array[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}