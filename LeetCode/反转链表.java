class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        head=stack.pop();
        ListNode head2=head;
        while(!stack.isEmpty()){
            ListNode tmp=stack.pop();
            head2.next=tmp;
            head2=tmp;
        }
        head2.next=null;
        return head;
    }
}