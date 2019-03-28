class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head!=null) {
            ListNode nullNode = new ListNode(-1);
            nullNode.next=head;
            ListNode cur=head,prev=nullNode;
            while(cur!=null){
                int count=0;
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                    count++;
                }
                if(count!=0){
                    prev.next=cur.next;
                }else {
                    prev = cur;
                }
                cur=cur.next;
            }
            head=nullNode.next;
        }
        return head;
    }
}