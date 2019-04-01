class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer> nums=new ArrayList<>();
        int fac=1;
        for(int i=1;i<=n;i++){
            nums.add(i);
            fac*=i;
        }
        fac/=n;
        k-=1;
        for(int i=n-1;i>=0;i--){
            int count=k/fac;
            sb.append(nums.remove(count));
            k-=count*fac;
            if(i>0)
                fac/=i;
        }
        return sb.toString();
    }
}