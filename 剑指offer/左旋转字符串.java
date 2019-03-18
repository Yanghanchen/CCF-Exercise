public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0||n==0){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=n;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        for(int i=0;i<n;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}