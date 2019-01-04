public class Solution{
    public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0){
            return -1;
        }
        char[] arr=str.toCharArray();
        int[] counts=new int['z'+1];
        for(char c:arr)
            counts[c]++;
        for(int i=0;i<counts.length;i++)
            if(counts[arr[i]]==1)
                return i;
        return -1;
    }
}