import java.util.*;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)return 0;
        int[] list=new int[index];
        list[0]=1;
        int i2=0,i3=0,i5=0;
        int next=1;
        while(next<index)
        {
            int m2=list[i2]*2;
            int m3=list[i3]*3;
            int m5=list[i5]*5;
            int min=Math.min(m2,Math.min(m3,m5));
            list[next++]=min;
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return list[index-1];
    }
}