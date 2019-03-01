class Solution {
    ArrayList<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if(s!=null&&s.length()!=0){
            partition(s,new ArrayList<>(),0);
        }
        return result;
    }

    private void partition(String s, ArrayList<String> temp, int start) {
        if(start>=s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int end=start;end<s.length();end++){
            String subStr = s.substring(start,end+1);
            if(isPalindrome(subStr)){
                temp.add(subStr);
                partition(s,temp,end+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        for(int i=0,j=charArray.length-1;i<j;i++,j--){
            if(charArray[i]!=charArray[j]) {
                return false;
            }
        }
        return true;
    }
}