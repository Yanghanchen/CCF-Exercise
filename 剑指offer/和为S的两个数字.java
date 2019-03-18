import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<>();
        if(array!=null&&array.length!=0) {
            int first = 0, second = array.length - 1;
            while (first < second) {
                int value=array[first] + array[second];
                if (value == sum) {
                    result.add(array[first]);
                    result.add(array[second]);
                    break;
                }else if (value>sum){
                    second--;
                }else{
                    first++;
                }
            }
        }
        return result;
    }
}