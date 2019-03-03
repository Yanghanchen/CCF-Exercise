class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null||needle.length()==0){
            return 0;
        }
        if(haystack==null||haystack.length()==0||haystack.length()<needle.length()){
            return -1;
        }
        if(haystack.length()==needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }
        int index=-1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                index = i;
                for(int j=i+1,k=1;j<haystack.length()&&k<needle.length();j++,k++){
                    if(haystack.charAt(j)==needle.charAt(k)){
                        continue;
                    }else{
                        index = -1;
                        break;
                    }
                }
                if(index!=-1){
                    return index;
                }
            }
        }
        return index;
    }
}