class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result=new ArrayList<>();
        HashMap<Integer,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] cArray=strs[i].toCharArray();
            int value=1;
            for(char ch:cArray){
                switch (ch){
                    case 'a':value*=2;break;
                    case 'b':value*=3;break;
                    case 'c':value*=5;break;
                    case 'd':value*=7;break;
                    case 'e':value*=11;break;
                    case 'f':value*=13;break;
                    case 'g':value*=17;break;
                    case 'h':value*=19;break;
                    case 'i':value*=23;break;
                    case 'j':value*=29;break;
                    case 'k':value*=31;break;
                    case 'l':value*=37;break;
                    case 'm':value*=41;break;
                    case 'n':value*=43;break;
                    case 'o':value*=47;break;
                    case 'p':value*=53;break;
                    case 'q':value*=59;break;
                    case 'r':value*=61;break;
                    case 's':value*=67;break;
                    case 't':value*=71;break;
                    case 'u':value*=73;break;
                    case 'v':value*=79;break;
                    case 'w':value*=83;break;
                    case 'x':value*=89;break;
                    case 'y':value*=97;break;
                    case 'z':value*=101;break;
                    default:
                }
            }
            if(map.get(value)==null){
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(strs[i]);
        }
        Iterator<Integer> iter=map.keySet().iterator();
        while(iter.hasNext()){
            result.add(map.get(iter.next()));
        }
        return result;
    }
}