class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> tmp=new ArrayList<>();
        tmp.add(words[0]);
        int length=words[0].length();
        for(int i=1;i<words.length;i++){
            if(length+words[i].length()+1<=maxWidth){
                tmp.add(" "+words[i]);
                length+=words[i].length()+1;
            }else{
                StringBuilder sb=new StringBuilder();
                if(tmp.size()==1){
                    sb.append(tmp.get(0));
                    while(sb.length() < maxWidth){
                        sb.append(" ");
                    }
                }else if(tmp.size()==2){
                    sb.append(tmp.get(0));
                    while(sb.length() + tmp.get(1).length() < maxWidth){
                        sb.append(" ");
                    }
                    sb.append(tmp.get(1));
                }else{
                    int countOfKongge=(maxWidth-length)/(tmp.size()-1);
                    int countOfAdditionalKongge=(maxWidth-length)%(tmp.size()-1);
                    for(int j=0;j<tmp.size()-1;j++){
                        sb.append(tmp.get(j));
                        int t=countOfKongge;
                        while(t>0){
                            sb.append(" ");
                            t--;
                        }
                        if(j<countOfAdditionalKongge){
                            sb.append(" ");
                        }
                    }
                    sb.append(tmp.get(tmp.size()-1));
                }
                result.add(sb.toString());
                tmp.clear();
                tmp.add(words[i]);
                length=words[i].length();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String s:tmp){
            sb.append(s);
        }
        while(sb.length()<maxWidth){
            sb.append(" ");
        }
        result.add(sb.toString());
        return result;
    }
}