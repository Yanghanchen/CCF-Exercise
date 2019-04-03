class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=head,cur=head.next;
        while(cur!=null){
            if(prev.val!=cur.val){
                prev.next=cur;
                prev=cur;
            }
            if(cur.next==null&&prev.val==cur.val){
                prev.next=null;
            }
            cur=cur.next;
        }
        return head;
    }
}