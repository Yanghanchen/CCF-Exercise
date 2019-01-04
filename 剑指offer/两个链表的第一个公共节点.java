public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }else{
            int l1=getLength(pHead1);
            int l2=getLength(pHead2);
            if(l1>l2){
                return find(l1,l2,pHead1,pHead2);
            }else{
                return find(l2,l1,pHead2,pHead1);
            }
        }
    }

    private ListNode find(int larger,int smaller,ListNode higher, ListNode lower) {
        while(larger-->smaller){
            higher=higher.next;
        }
        while(higher!=null&&higher.val!=lower.val){
            higher=higher.next;
            lower=lower.next;
        }
        return higher;
    }

    private int getLength(ListNode pHead) {
        int count=0;
        ListNode n=pHead;
        while(n!=null){
            count++;
            n=n.next;
        }
        return count;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}