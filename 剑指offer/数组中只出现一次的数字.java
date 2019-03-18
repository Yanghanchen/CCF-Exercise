//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int tmp=array[0];
        for(int i=1;i<array.length;i++){
            tmp^=array[i];
        }
        int indexOf1=FindFirstOf1(tmp);
        for(int i=0;i<array.length;i++){
            if(is1At(array[i],indexOf1)){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }

    private boolean is1At(int i, int indexOf1) {
        while(indexOf1-->0){
            i>>=1;
        }
        if((i&0x1)==1){
            return true;
        }else {
            return false;
        }
    }

    private int FindFirstOf1(int tmp) {
        int index=0;
        while(tmp!=1){
            tmp>>=1;
            index++;
        }
        return index;
    }
}