class Solution {
    public int findJudge(int N, int[][] trust) {
        int[][] people=new int[N][2];
        for(int[] t:trust){
            people[t[0]-1][0]+=1;
            people[t[1]-1][1]+=1;
        }
        for(int i=0;i<people.length;i++){
            if(people[i][0]==0&&people[i][1]==N-1){
                return i+1;
            }
        }
        return -1;
    }
}