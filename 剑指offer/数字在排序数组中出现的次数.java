public class Solution {
    int left=-1,right=-1;
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0){
            return 0;
        }else{
            if(array.length==1){
                if (array[0]==k){
                    return 1;
                }else {
                    return 0;
                }
            }
            GetFirstOfK(array,0,array.length-1,k);
            GetLastOfK(array,0,array.length-1,k);
            return right>-1&&left>-1?right-left+1:0;
        }
    }

    private void GetFirstOfK(int[] array, int start, int end, int k) {
        if(start<=end){
            int mid=(start+end)>>1;
            if(array[mid]==k){
                if((mid>0&&array[mid-1]!=k)||mid==0){
                    left=mid;
                    return;
                }else{
                    end=mid-1;
                }
            }else{
                if(array[mid]>k){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            GetFirstOfK(array,start,end,k);
        }
    }

    private void GetLastOfK(int[] array, int start, int end, int k) {
        if(start<=end){
            int mid=(start+end)>>1;
            if(array[mid]==k){
                if((mid<end&&array[mid+1]!=k)||mid==end){
                    right=mid;
                    return;
                }else{
                    start=mid+1;
                }
            }else{
                if(array[mid]>k){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            GetLastOfK(array,start,end,k);
        }
    }
}