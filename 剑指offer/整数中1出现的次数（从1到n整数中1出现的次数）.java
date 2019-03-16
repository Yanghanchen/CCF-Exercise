public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0){
            return 0;
        }
        if(n/10==0&&n>0){
            return 1;
        }
        int high=n,count=0;
        while(high>=10){
            high/=10;
            count++;
        }
        int low=n-high*pow10(count);
        int result=0;
        if(high>1){
            result+=pow10(count);
        }else{
            result+=low+1;
        }
        result+=high*NumberOf1Between1AndN_Solution((pow10(count)-1));
        result+=NumberOf1Between1AndN_Solution(low);
        return result;
    }

    private int pow10(int count) {
        if(count==0){
            return 1;
        }else if(count==1){
            return 10;
        }else {
            if (count % 2 == 0) {
                return pow10(count >> 1) * pow10(count >> 1);
            } else {
                return 10 * pow10(count >> 1) * pow10(count >> 1);
            }
        }
    }
}