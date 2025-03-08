package section9;

import java.util.Scanner;

public class exam2_answer {

    static int max;

    static int cnt;
    static int answer = Integer.MIN_VALUE;

    // DFS(81)
    // DFS(58)
    // DFS(42)
    // DFS(33)
    // DFS(61)

    private static void DFS(int L, int sum, int[] arr) {
        if (sum > max) {
            return;
        }

        if (L == cnt) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        max = input1;
        cnt = input2;
        int[] arr = new int[input2];
        for (int i=0; i < input2; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }

}
