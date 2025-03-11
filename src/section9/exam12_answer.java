package section9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam12_answer {

    static int[][] board;
    static int[][] dis;
    static int[][] range = {{1,0},{-1,0},{0,1},{0,-1}};
    static int y;
    static int x;

    static Queue<Point> queue = new LinkedList<>();

    private static void BFS() {
        while(!queue.isEmpty()) {
            Point poll = queue.poll();

            for (int[] ints : range) {
                int nx = poll.getX() + ints[0];
                int ny = poll.getY() + ints[1];

                if (nx > -1 && nx < x && ny > -1 && ny < y && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[poll.getX()][poll.getY()]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        y = input1;
        x = input2;
        board = new int[x][y];
        dis = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = in.nextInt();
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        BFS();
        boolean flag = true;
        int answer = 0;

        for(int i = 0; i< x; i++){
            for(int j = 0; j< y; j++){
                if(board[i][j]==0) flag=false;
            }
        }

        if(flag){
            for(int i = 0; i< x; i++){
                for(int j = 0; j< y; j++){
                    answer=Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }

}
