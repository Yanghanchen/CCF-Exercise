import java.util.*;

public class Solution {
    public String ReverseSentence(String str) {
        ArrayList<String> words=new ArrayList<>();
        if(str==null||str.length()==0){
            return "";
        }
        int start=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') {
                words.add(str.substring(start, i));
                start = ++i;
                continue;
            }
        }
        words.add(str.substring(start));
        StringBuilder sb=new StringBuilder();
        for(int i=words.size()-1;i>=0;i--){
            sb.append(words.get(i));
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}