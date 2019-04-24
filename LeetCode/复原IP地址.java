class Solution {
    ArrayList<String> result=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        restoreIpAddresses(s,"",4);
        return result;
    }

    private void restoreIpAddresses(String s, String s1, int count) {
        if(count==0){
            if(s.length()==0)
                result.add(s1.substring(0,s1.lastIndexOf('.')));
        }else{
            for(int i=1;i<=3&&i<=s.length();i++){
                int num=Integer.parseInt(s.substring(0,i));
                if(num<=255&&(num+"").length()==i){
                    restoreIpAddresses(s.substring(i),s1+num+".",count-1);
                }
            }
        }
    }
}