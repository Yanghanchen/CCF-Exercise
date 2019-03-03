class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0||strs[0].length()==0){
            return "";
        }
        for(int i=1;i<=strs[0].length();i++) {
            String s=strs[0].substring(0,i);
            for (int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(s)){
                    return s.substring(0,s.length()-1);
                }
            }
        }
        return strs[0];
    }
}