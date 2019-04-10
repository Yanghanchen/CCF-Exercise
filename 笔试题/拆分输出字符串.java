import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<N;i++){
            String s=sc.next();
            while(s.length()>=8){
                result.add(s.substring(0,8));
                s=s.substring(8);
            }
            int a=8-s.length();
            while(a>0){
                s+="0";
                a--;
            }
            if(!s.equals("00000000"))
                result.add(s);
        }
        Collections.sort(result);
        for(String s:result){
            System.out.print(s+" ");
        }
    }
}