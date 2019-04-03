class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        TreeNode root=new TreeNode(list.get(list.size()/2));
        sortedListToBST(list,0,list.size()/2-1,root,list.size()/2);
        sortedListToBST(list,list.size()/2+1,list.size()-1,root,list.size()/2);
        return root;
    }

    private void sortedListToBST(ArrayList<Integer> list, int start, int end, TreeNode root,int rootIndex) {
        if(start<end) {
            int mid = (start + end) >> 1;
            if(end-start==1)
                mid++;
            TreeNode newNode=new TreeNode(list.get(mid));
            if(rootIndex<start){
                root.right=newNode;
            }else{
                root.left=newNode;
            }
            sortedListToBST(list,start,mid-1,newNode,mid);
            sortedListToBST(list,mid+1,end,newNode,mid);
        }else if(start==end){
            TreeNode newNode=new TreeNode(list.get(start));
            if(rootIndex<start){
                root.right=newNode;
            }else{
                root.left=newNode;
            }
        }
    }
}