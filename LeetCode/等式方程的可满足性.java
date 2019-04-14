class Solution {
    public boolean equationsPossible(String[] equations) {
        ArrayList<String> notEquals=new ArrayList<>();
        int[] parent=new int[26];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        Arrays.sort(equations, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.contains("==")&&o2.contains("!=")){
                    return -1;
                }else if(o1.contains("!=")&&o2.contains("==")){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        for(String equation:equations){
            int left=equation.charAt(0)-'a';
            int right=equation.charAt(3)-'a';
            left=getParent(parent,left);
            right=getParent(parent,right);
            if(equation.charAt(1)=='='){
                parent[right]=left;
            }else{
                if(left==right) return false;
            }
        }
        return true;
    }

    private int getParent(int[] parent, int left) {
        while(parent[left]!=left){
            left=parent[left];
        }
        return left;
    }
}