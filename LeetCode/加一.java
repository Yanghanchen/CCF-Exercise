class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=false;
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]==9) {
                digits[i]=0;
                if(i!=0) {
                    continue;
                }else {
                    flag=true;
                }
            }else {
                digits[i] += 1;
                break;
            }
        }
        if(flag){
            int[] newDigits=new int[digits.length+1];
            newDigits[0]=1;
            for(int i=1;i<newDigits.length;i++) {
                newDigits[i]=digits[i-1];
            }
            return newDigits;
        }else {
            return digits;
        }
    }
}