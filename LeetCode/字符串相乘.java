class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int m=num1.length(),n=num2.length();
        int[] value=new int[m+n];
        char[] n1=num1.toCharArray(),n2=num2.toCharArray();
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                value[i+j+1]+=(n1[i]-'0')*(n2[j]-'0');
            }
        }
        for(int i=m+n-1;i>0;i--){
            if(value[i]>=10){
                int carry=value[i]/10;
                value[i]%=10;
                value[i-1]+=carry;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:value){
            sb.append(i);
        }
        while(sb.charAt(0)=='0'){
            sb.delete(0,1);
        }
        return sb.toString();
    }
}