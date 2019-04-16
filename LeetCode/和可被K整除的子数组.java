class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            sum%=K;
            if(sum<0){
                sum+=K;
            }
            if(sum==0){
                count++;
            }
            if(map.get(sum)!=null){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return count;
    }
}