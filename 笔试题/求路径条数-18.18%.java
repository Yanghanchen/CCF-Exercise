import java.util.*;

public class Main{
    static double CONSTANT=1e9;
    static int count=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        int[][] data=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                data[i][j]=sc.nextInt();
            }
        }
        int X=sc.nextInt(),Y=sc.nextInt(),Z=sc.nextInt(),W=sc.nextInt();
        boolean[][] visited=new boolean[N][M];
        visit(data,X,Y,Z,W,visited);
        System.out.println((int)(count%CONSTANT));
    }

    private static void visit(int[][] data, int x, int y, int z, int w, boolean[][] visited) {
        if(x==z&&y==w){
            count++;
        }else{
            if(x<data.length-1&&data[x+1][y]>data[x][y]&&!visited[x+1][y]){
                visited[x+1][y]=true;
                visit(data,x+1,y,z,w,visited);
                visited[x+1][y]=false;
            }
            else if(x>0&&data[x-1][y]>data[x][y]&&!visited[x-1][y]){
                visited[x-1][y]=true;
                visit(data,x-1,y,z,w,visited);
                visited[x-1][y]=false;
            }
            else if(y<data[0].length-1&&data[x][y+1]>data[x][y]&&!visited[x][y+1]){
                visited[x][y+1]=true;
                visit(data,x,y+1,z,w,visited);
                visited[x][y+1]=false;
            }
            else if(y>0&&data[x][y-1]>data[x][y-1]&&!visited[x][y-1]){
                visited[x][y-1]=true;
                visit(data,x,y-1,z,w,visited);
                visited[x][y-1]=false;
            }
        }
    }
}