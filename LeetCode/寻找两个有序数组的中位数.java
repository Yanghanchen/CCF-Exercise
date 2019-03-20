class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] merge=new int[m+n];
        int i=0,j=0,k=0;
        for(;i<m&&j<n;){
            if(nums1[i]>nums2[j]){
                merge[k++]=nums2[j++];
            }else{
                merge[k++]=nums1[i++];
            }
        }
        while(i<m){
            merge[k++]=nums1[i++];
        }
        while(j<n){
            merge[k++]=nums2[j++];
        }
        if((merge.length&0x1)==1){
            return merge[merge.length>>1];
        }else{
            return (merge[merge.length>>1]+merge[(merge.length>>1)-1])/2.0;
        }
    }
}