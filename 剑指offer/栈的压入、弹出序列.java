import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> A=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            A.push(pushA[i]);
            while(A.size()>0&&A.get(A.size()-1)==popA[j]){
                A.pop();
                j++;
            }
        }
        return A.size()==0;
    }
}