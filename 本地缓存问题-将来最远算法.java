public class Solution{
    //算法导论思考题16-5
    public void localCache(char[] list,int limit){
        char[] cache = new char[limit];
        int free=limit;
        for(int i=0;i<list.length;i++){
            if(free>0){
                cache[--free]=list[i];
                System.out.println("存入缓存："+list[i]);
            }else{
                boolean flag=false;
                for(char c:cache){
                    if(c==list[i]) {
                        System.out.println("缓存命中:"+c);
                        flag=true;
                    }
                }
                if(!flag) {
                    //需要淘汰
                    int farest = 0;
                    for (int j = 0; j < limit; j++) {
                        for (int k = i + 1; k < list.length; k++) {
                            if (cache[j] == list[k]) {
                                farest = farest > k ? farest : k;
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < limit; j++) {
                        if (cache[j] == list[farest]) {
                            System.out.println("淘汰：" + cache[j] + "，更新为：" + list[i]);
                            cache[j] = list[i];
                        }
                    }
                }
            }
        }
    }
}