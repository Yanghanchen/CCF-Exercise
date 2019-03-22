class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0||divisor==0){
            return 0;
        }
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(dividend^divisor)<0;
        long absdividend=Math.abs((long)dividend);
        long absdivisor=Math.abs((long)divisor);
        int result=0;
        for(int i=31;i>=0;i--){
            if((absdividend>>i)>=absdivisor){
                absdividend-=absdivisor<<i;
                result+=1<<i;
            }
        }
        if(isNegative)
            result =-result;
        return result;
    }
}