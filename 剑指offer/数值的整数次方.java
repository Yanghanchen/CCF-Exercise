public class Solution {
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        } else if(exponent==0){
            return 1;
        } else{
            if(base==0){
                return 0;
            }
            boolean isReciprocal=exponent>0?false:true;
            if(isReciprocal){
                exponent*=-1;
            }
            double result=1;
            for(int i=1;i<=exponent;i++){
                result*=base;
            }
            if(isReciprocal){
                result=1/result;
            }
            return result;
        }
    }
}