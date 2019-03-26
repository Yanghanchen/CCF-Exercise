class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=0;
        if(head==null){
            return head;
        }
        ListNode checkNode=head;
        while(length<k&&checkNode!=null){
            checkNode=checkNode.next;
            length++;
        }
        
        if(length==k){
            ListNode cur=head,next=null,prev=null;
            while (length>0){
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
                length--;
            }
            if(next!=null){
                head.next=reverseKGroup(next,k);
            }
            return prev;
        }else{
            return head;
        }
    }
}