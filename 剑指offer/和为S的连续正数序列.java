import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=1;i<=sum/2;i++){
            int tmp=0,j=i;
            ArrayList<Integer> tmpList=new ArrayList<>();
            while(tmp<sum){
                tmpList.add(j);
                tmp+=j;
                if(tmp==sum){
                    list.add(tmpList);
                    break;
                }else if(tmp>sum){
                    break;
                }
                j++;
            }
        }
        return list;
    }
}