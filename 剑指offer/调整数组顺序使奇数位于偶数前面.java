public class Solution {
    //书上的做法
    //牛客网增加了一个限制，要求相对位置不变，该算法无法AC
    public void reOrderArray(int [] array) {
        int left=0,right=array.length-1;
        while(left<right){
            while((array[left]&0x1)==1){
                left++;
            }
            while((array[right]&0x1)==0){
                right--;
            }
            if(left<right){
                int tmp=array[left];
                array[left]=array[right];
                array[right]=tmp;
            }
        }
    }
}