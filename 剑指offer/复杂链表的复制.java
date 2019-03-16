public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode node=pHead;
        while(node!=null){
            RandomListNode cloned=new RandomListNode(node.label);
            cloned.next=node.next;
            cloned.random=null;
            node.next=cloned;
            node=cloned.next;
        }
        node=pHead;
        while(node!=null){
            RandomListNode cloned=node.next;
            if(node.random!=null){
                cloned.random=node.random.next;
            }
            node=cloned.next;
        }
        node=pHead;
        RandomListNode newHead=null,newNode=null;
        if(node!=null){
            newHead=newNode=node.next;
            node.next=newNode.next;
            node=node.next;
        }
        while(node!=null){
            newNode.next=node.next;
            newNode=newNode.next;
            node.next=newNode.next;
            node=node.next;
        }
        return newHead;
    }
}