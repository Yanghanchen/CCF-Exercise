import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(size==0) return list;
        for(int i=0,j=i+size;j<=num.length;i++,j++){
            int max=0;
            for(int k=i;k<j;k++){
                max=num[k]>max?num[k]:max;
            }
            list.add(max);
        }
        return list;
    }
}