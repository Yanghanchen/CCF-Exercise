import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        ArrayList<String> result=new ArrayList<>();
        if(s==null||s.length()==0||wordDict==null||wordDict.size()==0||wordDict.contains(""))
            return result;
        for(int i=0;i<wordDict.size();i++){
            if(s.startsWith(wordDict.get(i))){
                process(wordDict,result,s.substring(wordDict.get(i).length()),wordDict.get(i));
            }
        }
        return result;
    }

    private void process(List<String> wordDict, ArrayList<String> result, String tmp, String str) {
        if(tmp.length()==0){
            result.add(str);
        }else {
            for(int j=0;j<wordDict.size();j++){
                if(tmp.startsWith(wordDict.get(j))){
                    process(wordDict,result,tmp.substring(wordDict.get(j).length()),str+" "+wordDict.get(j));
                }
            }
        }

    }
}