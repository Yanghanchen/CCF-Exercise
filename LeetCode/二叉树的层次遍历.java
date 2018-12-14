import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if (root!=null){
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while(queue.size()!=0){
                int count=queue.size();
                ArrayList<Integer> list1=new ArrayList<>();
                while(count>0){
                    TreeNode p=queue.poll();
                    list1.add(p.val);
                    if(p.left!=null)
                        queue.offer(p.left);
                    if(p.right!=null)
                        queue.offer(p.right);
                    count--;
                }
                list.add(list1);
            }
        }
        return list;
    }
}