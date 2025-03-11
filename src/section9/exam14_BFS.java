package section9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam14_BFS {

    static int[][] arr;
    static int[][] range = {{1,0},{1,1},{1,-1},{-1,0},{-1,1},{-1,-1},{0,1},{0,-1}};
    static int len;
    static int answer = 0;

    private static void BFS(int cx, int cy) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(cx, cy));
        arr[cx][cy] = 0;

        while (!queue.isEmpty()) {
            Point poll = queue.poll();

            for (int[] ints : range) {
                int nx = poll.getX()+ints[0];
                int ny = poll.getY()+ints[1];

                if (nx < len && nx > -1 && ny < len && ny > -1 && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
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

        //BFS(0, 0);;

        for (int i=0; i < len; i++) {
            for (int j=0; j < len; j++) {
                if (arr[i][j] == 1) {
                    BFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

}
