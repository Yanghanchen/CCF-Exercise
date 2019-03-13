class Solution {
    String[] dict=new String[]{" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        ArrayList<String> result=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return result;
        }
        findCombinations(result,digits,"",0);
        return result;
    }

    private void findCombinations(ArrayList<String> result, String digits, String record, int start) {
        if(start>digits.length()){
            return;
        }else if(start==digits.length()){
            result.add(record);
        }else{
            int index = digits.charAt(start) - '0';
            String translate = dict[index];
            for (int j = 0; j < translate.length(); j++) {
                String newRecord = record + translate.charAt(j);
                findCombinations(result, digits, newRecord, start + 1);
            }
        }
    }
}