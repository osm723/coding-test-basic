package section9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam5 {

    static Integer[] coinArr;
    static int exchange;
    static int coinCnt = Integer.MAX_VALUE;

    private static void DFS(int L, int sumCoin) {
        if (exchange < sumCoin) {
            return;
        }

        if (coinCnt <= L) {
            return;
        }

        if (exchange == sumCoin) {
            coinCnt = Math.min(coinCnt, L);
            return;
        } else {
            for (int i=0; i < coinArr.length; i++) {
                DFS(L+1, sumCoin + coinArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        coinArr = new Integer[input1];
        for (int i=0; i < input1; i++) {
            coinArr[i] = in.nextInt();
        }

        Arrays.sort(coinArr, Collections.reverseOrder());
        exchange = in.nextInt();

        DFS(0,0);
        System.out.println(coinCnt);
    }

}
