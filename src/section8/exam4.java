package section8;

import java.util.Scanner;

public class exam4 {

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n-1) + DFS(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        for (int i=1; i < input1; i++) {
            System.out.print(DFS(i) + " ");
        }
    }

}
