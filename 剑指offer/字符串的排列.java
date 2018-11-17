import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<>();
        if(str!=null&&str.length()>0){
            Permutation(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }

    private void Permutation(char[] cArray, int i, ArrayList<String> list) {
        if(i==cArray.length-1){
            String s=new String(cArray);
            if(!list.contains(s))
                list.add(s);
        }else{
            for(int j=0;j<cArray.length;j++){
                swap(cArray,i,j);
                Permutation(cArray,i+1,list);
                swap(cArray,i,j);
            }
        }
    }

    private void swap(char[] cArray, int i, int j) {
        char t=cArray[i];
        cArray[i]=cArray[j];
        cArray[j]=t;
    }
}