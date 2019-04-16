class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] result=new int[K][2];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(Math.sqrt(Math.pow(o1[0],2)+Math.pow(o1[1],2))<Math.sqrt(Math.pow(o2[0],2)+Math.pow(o2[1],2))){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        for(int i=0;i<K;i++){
            result[i]=points[i];
        }
        return result;
    }
}