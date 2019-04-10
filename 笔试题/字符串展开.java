import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Integer> numStack=new Stack<>();
        Stack<String> charStack=new Stack<>();
        char[] sArr=s.toCharArray();
        int num=0;
        String str="";
        for(int i=0;i<sArr.length;i++){
            char c=sArr[i];
            if(c>='0'&&c<='9'){
                num=num*10+c-'0';
            }
            if(c=='('||c=='['||c=='{'){
                numStack.push(num);
                num=0;
                charStack.push(str);
                str="";
            }
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                str+=c;
            }
            if(c==')'||c==']'||c=='}'){
                int n=numStack.pop();
                for(int j=0;j<n;j++){
                    charStack.push(charStack.pop()+str);
                }
                str=charStack.pop();
            }
        }
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}