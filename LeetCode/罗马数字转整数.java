class Solution {
    public int romanToInt(String s) {
        String[] nums=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] values=new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int result=0;
        while(s.length()>0){
            for(int i=nums.length-1;i>=0;i--){
                if(s.startsWith(nums[i])){
                    s=s.substring(nums[i].length());
                    result+=values[i];
                }
            }
        }
        return result;
    }
}