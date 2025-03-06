package section8;

import java.util.Scanner;

public class exam6 {

    static int n;
    static int[] ch;

    private static void DFS(int L) {
        if (L == n+1) {
            for (int i = 1; i < n+1; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = 3;
        ch = new int[n+1];
        DFS(1);
    }

}
