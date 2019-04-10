import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String sc=in.nextLine();
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<sc.length();i++){
            if (stack.isEmpty()){
                stack.push(sc.charAt(i));
                continue;
            }
            if (stack.peek()!=sc.charAt(i)){
                stack.pop();
            }else stack.push(sc.charAt(i));
        }
        int count=0;
        while (!stack.isEmpty()){
            stack.pop();
            count++;
        }
        System.out.println(count);
    }
}
