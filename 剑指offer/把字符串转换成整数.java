public class Solution {
    boolean isLegal=true;
    public int StrToInt(String str) {
        int result=0;
        boolean isNegative=false;
        if(str==null||str.matches("\\s*")){
            isLegal=false;
            return 0;
        }
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(i==0){
                if(c=='-'){
                    isNegative=true;
                    continue;
                }else if(c=='+'){
                    isNegative=false;
                    continue;
                }
            }
            if(c>='0'&&c<='9'){
                try {
                    result += (c - '0') * pow10(str.length() - 1 - i);
                }catch (Exception e){
                    isLegal=false;
                    return 0;
                }
            }else{
                isLegal=false;
                return 0;
            }
        }
        if(isNegative){
            try {
                result *= -1;
            }catch (Exception e){
                isLegal=false;
                return 0;
            }
        }
        return result;
    }

    private int pow10(int i) {
        if(i==0){
            return 1;
        }else if(i==1){
            return 10;
        }else{
            return (i&0x1)==1?10*pow10(i>>1)*pow10(i>>1):pow10(i>>1)*pow10(i>>1);
        }
    }
}