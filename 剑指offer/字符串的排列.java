import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<>();
        if(str==null||str.length()==0){
            return result;
        }
        doPermutation(str,"",result);
        return result;
    }

    private void doPermutation(String str, String s,ArrayList<String> result) {
        if(str.length()==0){
            if(!result.contains(s))
                result.add(s);
        }else{
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                doPermutation(str.replaceFirst(c+"",""),s+c,result);
            }
        }
    }
}