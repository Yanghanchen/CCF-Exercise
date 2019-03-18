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

    // public boolean isContinuous(int [] numbers) {
    //     if(numbers!=null&&numbers.length==5){
    //         int count0=0,diff=0;
    //         Arrays.sort(numbers);
    //         for(int i=0;i<numbers.length;i++){
    //             if(numbers[i]==0){
    //                 count0++;
    //             }else{
    //                 if(i>0&&numbers[i-1]!=0){
    //                     if(numbers[i]-numbers[i-1]>1&&numbers[i]-numbers[i-1]<=5) {
    //                         diff += numbers[i] - numbers[i - 1] - 1;
    //                     }else if(numbers[i]==numbers[i-1]||numbers[i]>13){
    //                         return false;
    //                     }
    //                 }
    //             }
    //         }
    //         if(count0>=diff||diff==0){
    //             return true;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return false;
    // }
}