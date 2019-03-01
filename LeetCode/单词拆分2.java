public class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(s==null||s.length()==0||wordDict==null||wordDict.size()==0||!wordBreak1(s,wordDict)){
            return new ArrayList<>();
        }
        ArrayList<String> result = new ArrayList<>();
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

    public boolean wordBreak1(String s, List<String> wordDict) {
        if(s==null||s.length()==0||wordDict==null||wordDict.size()==0){
            return false;
        }
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}