public boolean leafSimilar(TreeNode root1, TreeNode root2) {
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();
	this.leafNode(list1, root1);
	this.leafNode(list2, root2);
	if(list1.size() != list2.size()) return false;
	for(int i=0;i<list1.size();i++)
		if(list1.get(i) != list2.get(i))
			return false;
    return true;
}

private void leafNode(List<Integer> list, TreeNode node){
	if(node == null) return;
	if(node.left == null && node.right == null){
		list.add(node.val);
		return;
	}
	this.leafNode(list, node.left);
	this.leafNode(list, node.right);
}