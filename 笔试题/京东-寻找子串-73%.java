import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        String[] S=new String[m];
        for(int i=0;i<m;i++){
            S[i]=sc.next();
        }
        String T=sc.next();
        int count=0;
        Arrays.sort(S, (o1, o2) -> o1.length()-o2.length());
        for(String si:S){
            if(T.contains(si)){
                int originLength=T.length();
                int newLength=T.replaceAll(si,"").length();
                count+=(originLength-newLength)/si.length();
                T=T.replaceAll(si,"-");
            }
        }
        System.out.println(count);
    }
}