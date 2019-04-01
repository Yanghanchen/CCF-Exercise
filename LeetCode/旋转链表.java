class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head!=null&&k!=0) {
            int length = 1;
            ListNode cur=head;
            while(cur.next!=null){
                cur=cur.next;
                length++;
            }
            k%=length;
            if(length==1||k==0){
                return head;
            }
            ListNode first=head.next;
            ListNode second=head;
            int i=length-k-1;
            while(i>0){
                first=first.next;
                second=second.next;
                i--;
            }
            ListNode tmp=first;
            while(first.next!=null){
                first=first.next;
            }
            first.next=head;
            second.next=null;
            head=tmp;
        }
        return head;
    }
}