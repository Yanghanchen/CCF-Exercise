class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return;
        }
        HashMap<Integer,ArrayList<Integer>> record=new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(record.get(i)==null){
                        record.put(i,new ArrayList<>());
                    }
                    record.get(i).add(j);
                }
            }
        }
        Iterator<Integer> it=record.keySet().iterator();
        while(it.hasNext()){
            int row=it.next();
            int[] replace=new int[matrix[0].length];
            matrix[row]=replace;
            for(int col:record.get(row)){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][col]=0;
                }
            }
        }
    }
}