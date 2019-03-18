import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(sum>1){
            int first=1,second=2;
            ArrayList<Integer> tmp=new ArrayList<>();
            while(first<(sum+1)>>1){
                int value=calcSum(first,second);
                if(value<sum){
                    second++;
                }else if(value>sum){
                    first++;
                }else{
                    for(int i=first;i<=second;i++){
                        tmp.add(i);
                    }
                    result.add(new ArrayList<>(tmp));
                    tmp.clear();
                    second++;
                }
            }
        }
        return result;
    }

    private int calcSum(int first, int second) {
        int result=0;
        for(int i=first;i<=second;i++){
            result+=i;
        }
        return result;
    }
}