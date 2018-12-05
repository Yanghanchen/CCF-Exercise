import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5)
            return false;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0) continue;
            else{
                if(numbers[i]>13)
                    return false;
                if(numbers[numbers.length-1]-numbers[i]>=5)
                    return false;
                if(i>0&&numbers[i-1]==numbers[i])
                    return false;
                if(i==numbers.length-1)
                    return true;
            }
        }
        return true;
    }
}