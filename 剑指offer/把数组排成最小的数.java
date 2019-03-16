import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String result="";
        Arrays.sort(numbers);
        if(numbers!=null&&numbers.length!=0){
            result+=numbers[0];
            for(int i=1;i<numbers.length;i++){
                if(!larger(result+numbers[i],numbers[i]+result)){
                    result=result+numbers[i];
                }else{
                    result=numbers[i]+result;
                }
            }
        }
        return result;
    }

    private boolean larger(String s, String s1) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s1.charAt(i)){
                continue;
            }else if (s.charAt(i)<=s1.charAt(i)){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }
}