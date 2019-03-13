public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l1.val==0){
            return l2;
        }
        if(l2==null||l2.val==0){
            return l1;
        }
        Stack<ListNode> stack1=new Stack<>(),stack2=new Stack<>();
        while(l1!=null){
            stack1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2);
            l2=l2.next;
        }
        ListNode cur=null;
        boolean flag=false;
        while(!stack1.empty()||!stack2.empty()){
            int val1=stack1.empty()?0:stack1.pop().val;
            int val2=stack2.empty()?0:stack2.pop().val;
            int sum=val1+val2;
            if(flag){
                sum++;
                flag=false;
            }
            if(sum/10!=0){
                flag=true;
            }
            ListNode tmp=new ListNode(sum%10);
            tmp.next=cur;
            cur=tmp;
        }
        if(flag){
            ListNode head=new ListNode(1);
            head.next=cur;
            cur=head;
        }
        return cur;
    }