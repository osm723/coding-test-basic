package section9;

import java.util.Scanner;

public class exam2 {

    static int max;
    static int cnt;
    static int answer = Integer.MIN_VALUE;
    static int[] arr;

    private static void DFS(int L, int sum) {
        if (sum > max) {
            return;
        }

        if (L == cnt) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        arr = new int[input2];
        for (int i=0; i < input2; i++) {
            arr[i] = in.nextInt();
        }

        max = input1;
        cnt = input2;

        DFS(0, 0);
        System.out.println(answer);
    }

}
