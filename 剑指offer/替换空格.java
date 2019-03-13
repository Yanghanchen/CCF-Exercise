public class Solution {
    //非原地法
    public String replaceSpace(StringBuffer str) {
    	StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    //原地算法
    public String replaceSpace2(StringBuffer str) {
    	if(str.length()==0){
            return str.toString();
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        if(count==0){
            return str.toString();
        }
        int oldIndex=str.length()-1;
        int newLength=str.length()+count*2;
        int newIndex=newLength-1;
        str.setLength(newLength);
        while(oldIndex>=0&&newIndex>oldIndex){
            if(str.charAt(oldIndex)==' '){
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else {
                str.setCharAt(newIndex--,str.charAt(oldIndex));
            }
            oldIndex--;
        }
        return str.toString();
    }
}