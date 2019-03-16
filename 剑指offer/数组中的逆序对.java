import java.util.*;

public class Solution {
    int MOD=1000000007;
    int count=0;
    public int InversePairs(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        mergeSortAndCount(array);
        return count%MOD;
    }

    private int[] mergeSortAndCount(int[] array) {
        if(array.length<2){
            return array;
        }
        int mid=array.length>>1;
        int[] left=Arrays.copyOfRange(array,0,mid);
        int[] right=Arrays.copyOfRange(array,mid,array.length);
        return mergeAndCount(mergeSortAndCount(left),mergeSortAndCount(right));
    }

    private int[] mergeAndCount(int[] left, int[] right) {
        int[] tmp=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]>right[j]){
                tmp[k++]=right[j++];
                count+=left.length-i;
                count%=MOD;
            }else{
                tmp[k++]=left[i++];
            }
        }
        while(i<left.length){
            tmp[k++]=left[i++];
        }
        while(j<right.length){
            tmp[k++]=right[j++];
        }
        return tmp;
    }
}