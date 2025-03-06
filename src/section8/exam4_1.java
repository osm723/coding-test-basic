package section8;

import java.util.Scanner;

public class exam4_1 {

    static int[] ch;

    private static int DFS(int n) {
        if (n == 1) {
            ch[n] = 1;
            return ch[n];
        } else if (n == 2) {
            ch[n] = 1;
            return ch[n];
        } else {
            ch[n] = DFS(n-1) + DFS(n-2);
            return ch[n];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        ch = new int[input1+1];
        DFS(input1);

        for (int i=1; i < input1+1; i++) {
            System.out.print(ch[i] + " ");
        }
    }

}
