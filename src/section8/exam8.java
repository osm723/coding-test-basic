package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam8 {

    static int[] range = {1, -1, 5};

    private static int BFS(int me, int cow) {
        Queue<Integer> queue = new LinkedList<>();
        int[] ch = new int[10001];
        ch[me] = 1;
        queue.offer(me);
        int L = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int cur = queue.poll();
                for (int j=0; j < 3; j++) {
                    int nx = cur + range[j];
                    if (nx == cow) {
                        return L+1;
                    }
                    if (nx >=1 && nx < 100001 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        System.out.println(BFS(input1, input2));
    }

}
