class Solution {
    public int brokenCalc(int X, int Y) {
        int count=0;
        while(X<Y){
            if((Y&0x1)==1){
                Y++;
            }else{
                Y/=2;
            }
            count++;
        }
        return count+X-Y;
    }
}