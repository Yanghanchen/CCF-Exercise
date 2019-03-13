public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode curNode=head;
        ListNode preNode=null,tmpNode;
        while(curNode!=null){
            tmpNode=curNode.next;
            curNode.next=preNode;
            if(tmpNode==null)
                return curNode;
            preNode=curNode;
            curNode=tmpNode;
        }
        return curNode;
    }
}