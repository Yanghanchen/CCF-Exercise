class Solution {
    public int lengthOfLIS(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num:arr){
            if(result.isEmpty()||num>result.get(result.size()-1)){
                result.add(num);
            }else{
                result.set(getIndex(result,num),num);
            }
        }
        return result.size();
    }

    private int getIndex(ArrayList<Integer> result, int num) {
        int i=0,i1=result.size();
        while(i<i1){
            int mid=i+((i1-i)>>>1);
            if(result.get(mid)<num)
                i=mid+1;
            else
                i1=mid;
        }
        return i;
    }
}