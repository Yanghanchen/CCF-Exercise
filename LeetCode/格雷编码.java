class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            result.add(i^i>>1);
        }
        return result;
    }
}