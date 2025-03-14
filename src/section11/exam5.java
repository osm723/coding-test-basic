package section11;

import java.util.Scanner;

public class exam5 {

    static int max;
    static int coinCnt;
    static int answer = Integer.MAX_VALUE;
    static int[] arr;

    private static void DFS(int L, int sum) {
        if (L >= answer) {
            return;
        }

        if (sum > max) {
            return;
        }

        if (sum == max) {
            answer = L;
        } else {
            for (int i=coinCnt-1; i >= 0; i--) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        coinCnt = in.nextInt();
        arr = new int[coinCnt];
        for (int i = 0; i < coinCnt; i++) {
            arr[i] = in.nextInt();
        }
        max = in.nextInt();

        DFS(0, 0);
        System.out.println(answer);
    }

}
