package section9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam11 {

    static int[][] arr;
    static int[][] dis;
    static int[][] range = {{0,1},{1,0},{-1,0},{0,-1}};

    private static void BFS(int L, int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        arr[x][y] = 1;

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i=0; i < len; i++) {
                Point poll = queue.poll();
                int cx = poll.getX();
                int cy = poll.getY();

                for (int[] ints : range) {
                    int nx = cx+ints[0];
                    int ny = cy+ints[1];

                    if (nx > 0 && ny > 0 && nx < 8 && ny < 8 && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        dis[nx][ny] = dis[cx][cy]+1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        arr = new int[8][8];
        dis = new int[8][8];
        for (int i=1; i< 8; i++) {
            for (int j=1; j< 8; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        BFS(0, 1, 1);

        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}

