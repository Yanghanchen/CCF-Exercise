class Solution {
    public String convert(String s, int numRows) {
        if(s==null||s.length()==0||numRows==1){
            return s;
        }
        ArrayList<Character>[] zword=new ArrayList[numRows];
        for(int j=0;j<zword.length;j++){
            zword[j]=new ArrayList<>();
        }
        int i=0;
        boolean flag=true;
        for(char c:s.toCharArray()){
            zword[i].add(c);
            if(flag){
                i++;
            }else{
                i--;
            }
            if(i==0){
                flag=true;
            }
            if(i==numRows-1){
                flag=false;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<numRows;j++){
            for(char c:zword[j]){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}