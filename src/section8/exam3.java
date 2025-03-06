package section8;

import java.util.Scanner;

public class exam3 {

    private static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        System.out.print(DFS(input1));
    }

}
