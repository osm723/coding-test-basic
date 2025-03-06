package section8;

import java.util.ArrayList;
import java.util.Scanner;

public class exam13 {

    static int[] ch;
    //static int[][] graph;

    static ArrayList<ArrayList<Integer>> graph;

    static int n;

    private static int DFS(int v) {
        int answer = 0;

        ch[1] = 1;

        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
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
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i < input1+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[input1+1];
        for (int i = 0; i < input2; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        System.out.println(DFS(1));
    }

}
