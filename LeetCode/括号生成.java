class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<>();
        if(n!=0){
            generateParenthesis(result,"",0,0,n);
        }
        return result;
    }

    private void generateParenthesis(ArrayList<String> result, String s, int countLeft, int countRight, int n) {
        if (countLeft>n||countRight>n) return;
        if (countLeft==n&&countRight==n) result.add(s);
        if (countLeft>=countRight){
            generateParenthesis(result,s+"(",countLeft+1,countRight,n);
            generateParenthesis(result,s+")",countLeft,countRight+1,n);
        }
    }
}