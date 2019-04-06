class Solution {
    public String decodeString(String s) {
        if(s==null&&s.length()==0){
            return s;
        }
        Stack<Integer> numStack=new Stack<>();
        Stack<String> charStack=new Stack<>();
        char[] sArr=s.toCharArray();
        int num=0;
        String str="";
        for(int i=0;i<sArr.length;i++){
            char c=sArr[i];
            if(c>='0'&&c<='9'){
                num=num*10+c-'0';
            }
            if(c=='['){
                numStack.push(num);
                num=0;
                charStack.push(str);
                str="";
            }
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                str+=c;
            }
            if(c==']'){
                int n=numStack.pop();
                for(int j=0;j<n;j++){
                    charStack.push(charStack.pop()+str);
                }
                str=charStack.pop();
            }
        }
        return str;
    }
}