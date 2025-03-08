package section9;

import java.util.Scanner;

public class exam7 {

    static int[][] arr;

    private static int DFS(int n, int r) {

        if (r == 0) {
            return arr[n][r] = 1;
        } else if (r == 1) {
            return arr[n][r] = n;
        } else if (n == r) {
            return arr[n][r] = 1;
        } else {
            return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        arr = new int[input1 + 1][input2 + 1];
        DFS(input1, input2);

        System.out.println(arr[input1][input2]);
    }

}
