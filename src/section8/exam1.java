package section8;

import java.util.Scanner;

public class exam1 {

    private static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        DFS(input1);
    }

}
