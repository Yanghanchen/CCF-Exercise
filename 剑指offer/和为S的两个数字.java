import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        if(array.length==0||sum<=0)
            return list;
        int a=0,b=0,multi=Integer.MAX_VALUE,ta=0,tb=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                a=array[i];
                b=array[j];
                if(a+b==sum&&a*b<multi){
                    multi=a*b;
                    ta=a;
                    tb=b;
                }
            }
        }
        if(ta==0&&tb==0)
            return list;
        list.add(Math.min(ta,tb));
        list.add(Math.max(ta,tb));
        return list;
    }
}