public class Solution {
    public int StrToInt(String str) {
        int sum=0;
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0&&c=='+')
                continue;
            else if(i==0&&c=='-'){
                flag=false;
                continue;
            }else{
                if(c<='9'&&c>='0')
                    sum+=(int)((c-'0')*Math.pow(10,str.length()-i-1));
                else{
                    sum=0;
                    break;
                }
            }
        }
        if(!flag) sum*=-1;
        return sum;
    }
}