class Solution {
    public int firstUniqChar(String s) {
        if(s==null||s.length()==0){
            return -1;
        }
        if(s.length()==1){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!s.substring(i+1).contains(c+"")&&!sb.toString().contains(c+"")){
                return i;
            }
            sb.append(c);
        }
        return -1;
    }
}