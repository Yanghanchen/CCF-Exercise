public class Solution {
    public void print1ToMaxOfNDigits(int n){
        if(n<=0){
            return;
        }else{
            char[] nums=new char[n];
            for(int i=0;i<=9;i++) {
                nums[0]= (char) (i+'0');
                print1ToMaxOfNDigits(nums,n, 0);
            }
        }
    }

    private void print1ToMaxOfNDigits(char[] nums,int n, int index) {
        if(index==n-1){
            boolean canPrint=false;
            for(int i=0;i<nums.length;i++){
                if(!canPrint&&nums[i]!='0'){
                    canPrint=true;
                }
                if(canPrint){
                    System.out.print(nums[i]);
                }
            }
            System.out.println();
        }else{
            for(int j=0;j<=9;j++){
                nums[index+1]= (char) (j+'0');
                print1ToMaxOfNDigits(nums,n,index+1);
            }
        }
    }
}