class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> result=new ArrayList<>();
        if(A!=null&&A.length!=0){
            int num=0;
            for(int n:A){
                num=(num<<1)%5+n;
                result.add(num%5==0);
            }
        }
        return result;
    }
}