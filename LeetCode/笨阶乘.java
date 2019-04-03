class Solution {
    public int clumsy(int N) {
        if(N<=2){
            return N;
        }else if (N<=4){
            return N+3;
        }else{
            if(N%4==0){
                return N+1;
            }else if(N%4<=2){
                return N+2;
            }else{
                return N-1;
            }
        }
    }
}