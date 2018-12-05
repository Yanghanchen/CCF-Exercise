class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        if(str.toCharArray()[0]=='1'&&str.indexOf("1")==str.lastIndexOf("1"))
            return true;
        else
            return false;
    }
}