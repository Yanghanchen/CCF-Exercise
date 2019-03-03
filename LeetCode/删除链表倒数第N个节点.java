class Solution {
    //栈方法：利用栈先进后出的方式从后取待删除节点的前驱结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        if(stack.size()==1){
            return null;
        }
        if(stack.size()==n){
            return tmp.next;
        }
        while(n-->0){
            stack.pop();
        }
        ListNode prev = stack.pop();
        prev.next = prev.next.next;
        return tmp;
    }
    //双指针法
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     if(head==null||head.next==null){
    //         return null;
    //     }
    //     ListNode first,second;
    //     first=second=head;
    //     while(n>0){
    //         if(first.next!=null){
    //             n--;
    //             first=first.next;
    //         }else{
    //             break;
    //         }
    //     }
    //     while(first.next!=null){
    //         first=first.next;
    //         second=second.next;
    //     }
    //     if(n==0){
    //         second.next=second.next.next;
    //         return head;
    //     }else{
    //         while(n-->0){
    //             second=second.next;
    //         }
    //         return second;
    //     }
    // }
}