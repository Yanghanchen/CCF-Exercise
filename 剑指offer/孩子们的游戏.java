import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)
            return -1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int last=0;
        while(list.size()>1){
            last=(last+m-1)%list.size();
            list.remove(last);
        }
        return list.get(0);
    }
}