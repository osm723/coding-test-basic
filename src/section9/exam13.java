package section9;

import java.util.Scanner;

public class exam13 {

    static int[][] arr;
    static int[][] range = {{1,0},{1,1},{1,-1},{-1,0},{-1,1},{-1,-1},{0,1},{0,-1}};
    static int len;
    static int answer = 0;

    private static void DFS(int i, int j) {
        if (i < 0 || j < 0 || i > len || j > len) {
            return;
        } else {
            for (int[] ints : range) {
                int x = i+ints[0];
                int y = j+ints[1];

                if (x < len && x > -1 && y < len && y > -1 && arr[x][y] == 1) {
                    arr[x][y] = 0;
                    DFS(x, y);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        len = in.nextInt();
        arr = new int[len][len];
        for (int i=0; i < len; i++) {
            for (int j=0; j < len; j++) {
                int input = in.nextInt();
                arr[i][j] = input;
            }
        }

        for (int i=0; i < len; i++) {
            for (int j=0; j < len; j++) {
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

}
