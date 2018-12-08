import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows>0) {
            for (int i = 1; i <= numRows; i++) {
                List<Integer> list=new ArrayList<>();
                list.add(1);
                if(i==1){

                }else{
                    for(int j=1;j<i-1;j++){
                        list.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
                    }
                    list.add(1);
                }
                result.add(list);
            }
        }
        return result;
    }
}