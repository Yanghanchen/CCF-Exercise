class Solution {
    public int longestValidParentheses(String s) {
        int longest=0;
        if(s!=null&&s.length()!=0) {
                Stack<Integer> kuohao=new Stack<>();
            boolean[] signs=new boolean[s.length()];
            for(int i=0;i<s.length();i++){
                switch (s.charAt(i)){
                    case '(':kuohao.push(i);break;
                    case ')':if(kuohao.size()>0) {
                        signs[i]=signs[kuohao.pop()]=true;
                    }break;
                }
            }
            int count=0;
            for(boolean b:signs){
                if(b){
                    longest=Math.max(longest,++count);
                }else{
                    count=0;
                }
            }
        }
        return longest;
    }
}