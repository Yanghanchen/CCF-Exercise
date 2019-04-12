class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb=new StringBuilder();
        char a='a',b='b';
        if(A<B){
            int t=A;
            A=B;
            B=t;
            char c=a;
            a=b;
            b=c;
        }
        while(A+B>0){
            if(A>0){
                sb.append(a);
                A--;
            }
            if(A>B){
                sb.append(a);
                A--;
            }
            if(B>0){
                sb.append(b);
                B--;
            }
        }
        return sb.toString();
    }
}