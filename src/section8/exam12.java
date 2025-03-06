package section8;

import java.util.Scanner;

public class exam12 {

    static int[] ch;
    static int[][] graph;

    static int n;

    private static int DFS(int v) {
        int answer = 0;
        ch[1] = 1;

        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i < graph.length+1; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        n = input1;

        ch = new int[input1+1];
        graph = new int[input1+1][input1+1];
        for (int i = 0; i < input2; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }
        System.out.println(DFS(1));
    }

}
