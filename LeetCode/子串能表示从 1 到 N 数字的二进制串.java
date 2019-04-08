class Solution {
    public boolean queryString(String S, int N) {
        if(S==null||S.length()==0){
            return false;
        }
        for(int i=1;i<=N;i++){
            String tmp=Integer.toBinaryString(i);
            if(!S.contains(tmp)){
                return false;
            }
        }
        return true;
    }
}