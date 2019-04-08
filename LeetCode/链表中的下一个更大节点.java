class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<ListNode> nodes=new ArrayList<>();
        while(head!=null){
            nodes.add(head);
            head=head.next;
        }
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[nodes.size()];
        for(int i=nodes.size()-1;i>=0;i--){
            while(!stack.empty()&&stack.peek()<=nodes.get(i).val){
                stack.pop();
            }
            result[i]=stack.empty()?0:stack.peek();
            stack.push(nodes.get(i).val);
        }
        return result;
    }
}