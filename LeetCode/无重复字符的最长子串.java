class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s!=null&&s.length()!=0){
            int[] chars=new int[256];
            int res=0;
            for(int i=0,j=0;j<s.length();j++){
                 i=Math.max(i,chars[s.charAt(j)]);
                 res=Math.max(res,j-i+1);
                 chars[s.charAt(j)]=j+1;
            }
            return res;
        }
        return 0;
    }
}