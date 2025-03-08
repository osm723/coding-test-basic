package section9;

import java.util.Scanner;

public class exam10 {

    static int[][] arr;
    static int answer = 0;

    private static void DFS(int x, int y) {
        if (x > 7 || y > 7 || x < 0 || y < 0) {
            return;
        }

        if (x == 7 && y == 7) {
            answer++;
            return;
        } else {
            if (x-1 > 0 && arr[x-1][y] != 1) {
                //System.out.print("x-1=" + (x-1) + ":" + y);
                //System.out.println();
                arr[x][y]=1;
                DFS(x-1,y);
                arr[x][y]=0;
            }
            if (x+1 < 8 && arr[x+1][y] != 1) {
                //System.out.print("x+1=" + (x+1) + ":" + y);
                //System.out.println();
                arr[x][y]=1;
                DFS(x+1,y);
                arr[x][y]=0;
            }
            if (y-1 > 0 && arr[x][y-1] != 1) {
                //System.out.print("y-1=" + x + ":" + (y-1));
                //System.out.println();
                arr[x][y]=1;
                DFS(x,y-1);
                arr[x][y]=0;
            }
            if (y+1 < 8 && arr[x][y+1] != 1) {
                //System.out.print("y+1=" + x + ":" + (y+1));
                //System.out.println();
                arr[x][y]=1;
                DFS(x,y+1);
                arr[x][y]=0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        arr = new int[8][8];
        for (int i=1; i < 8; i++) {
            for (int j=1; j < 8; j++) {
                int input = in.nextInt();
                arr[i][j] = input;
            }
        }

        DFS(1, 1);
        System.out.println(answer);
    }

}
