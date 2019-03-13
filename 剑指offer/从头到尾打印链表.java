import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<>();
        if(listNode!=null) {
            traverse(listNode, result);
        }
        return result;
    }

    private void traverse(ListNode listNode, ArrayList<Integer> result) {
        if(listNode.next!=null){
            traverse(listNode.next,result);
        }
        if(listNode!=null){
            result.add(listNode.val);
        }
    }
}