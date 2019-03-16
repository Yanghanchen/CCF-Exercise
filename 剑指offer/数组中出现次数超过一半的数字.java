public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int result=array[0],count=1;
        for(int i=1;i<array.length;i++){
            if(count==0){
                result=array[i];
                count=1;
            }else if(result!=array[i]){
                count--;
            }else {
                count++;
            }
        }
        if(isNotMoreThanHalf(array,result)){
            return 0;
        }
        return result;
    }

    private boolean isNotMoreThanHalf(int[] array, int result) {
        int count=0;
        for(int i:array){
            if(i==result){
                count++;
            }
        }
        if (count<=array.length/2){
            return true;
        }
        return false;
    }
}