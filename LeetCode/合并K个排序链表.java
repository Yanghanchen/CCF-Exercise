class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2){
            return mergeTwoLists(lists[0],lists[1]);
        }
        int mid=lists.length>>1;
        return mergeTwoLists(mergeKLists(Arrays.copyOfRange(lists,0,mid)),mergeKLists(Arrays.copyOfRange(lists,mid,lists.length)));
    }

    private ListNode mergeTwoLists(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;

        ListNode head = null;
        if (left.val <= right.val){
            head = left;
            head.next = mergeTwoLists(left.next, right);
        } else {
            head = right;
            head.next = mergeTwoLists(left, right.next);
        }
        return head;
    }
}