import java.util.HashMap;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int k=array.length/2+1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:array){
            if(map.get(i)==null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
            if(map.get(i)>=k)
                return i;
        }
        return 0;
    }
}