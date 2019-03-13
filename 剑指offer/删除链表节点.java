public class Solution {
    public void deleteNode(ListNode pHead,ListNode pToBeDeleted){
        if(pHead==null||pToBeDeleted==null){
            return;
        }else{
            if(pToBeDeleted.next!=null){
                ListNode nextNode=pToBeDeleted.next;
                pToBeDeleted.val=nextNode.val;
                pToBeDeleted.next=nextNode.next;
                nextNode=null;
            }else if(pHead==pToBeDeleted){
                pHead=null;
            }else{
                ListNode tmp=pHead;
                while (tmp.next!=pToBeDeleted){
                    tmp=tmp.next;
                }
                tmp.next=null;
                pToBeDeleted=null;
            }
        }
    }
}