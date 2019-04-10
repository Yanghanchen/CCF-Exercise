class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(target<=startFuel){
            return 0;
        }
        if(stations==null||stations.length==0||stations[0][0]>startFuel){
            return -1;
        }
        int count=0,index=0;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        while(startFuel<target){
            while(index<stations.length&&stations[index][0]<=startFuel){
                priorityQueue.add(stations[index++][1]);
            }
            if(priorityQueue.isEmpty()){
                return -1;
            }
            startFuel+=priorityQueue.poll();
            count++;
        }
        return count;
    }
}