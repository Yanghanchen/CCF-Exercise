class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!isNotAlphaOrNum(c)){
                sb.append(c);
            }
        }
        s=sb.toString();
        char[] charArray=s.toLowerCase().toCharArray();
        if(charArray.length<=1){
            return true;
        }
        for(int i=0,j=charArray.length-1;i<j;i++,j--){
            if(charArray[i]!=charArray[j]) {
                return false;
            }
        }
        return true;
    }

    private boolean isNotAlphaOrNum(char c) {
        if((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z')){
            return false;
        }
        return true;
    }
}