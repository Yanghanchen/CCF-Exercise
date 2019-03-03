class Solution {
    public int myAtoi(String str) {
        if(str==null||str.length()==0){
            return 0;
        }
        str=str.trim();
        boolean isNegative = false;
        if(str.startsWith("-")){
            isNegative = true;
            str=str.substring(1);
        }else if(str.startsWith("+")){
            isNegative = false;
            str=str.substring(1);
        }
        if (str.length()==0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c<'0'||c>'9'){
                if(i==0){
                    return 0;
                }
                break;
            }
            sb.append(c);
        }
        int i;
        try{
            i=Integer.parseInt(sb.toString());
        }catch (Exception e){
            if(isNegative){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        i=isNegative?-1*i:i;
        return i;
    }
}