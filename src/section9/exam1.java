package section9;

import java.util.Arrays;
import java.util.Scanner;

public class exam1 {

    static int total;
    static int[] arr;
    static int cnt;
    static String answer = "NO";

    private static void DFS(int L, int sum) {
        if (answer.equals("YES")) {
            return;
        }
        if (total - sum == sum) {
            answer = "YES";
            return;
        }

        if (L == cnt) {
            return;
        } else {
            DFS(L+1, sum + arr[L+1]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        arr = new int[input1+1];
        for (int i=1; i < input1+1; i++) {
            arr[i] = in.nextInt();
        }

        cnt = input1;
        total = Arrays.stream(arr).sum();

        DFS(0, 0);
        System.out.println(answer);
    }

}
