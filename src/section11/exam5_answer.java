package section11;

import java.util.Arrays;
import java.util.Scanner;

public class exam5_answer {

    static int change;
    static int coinCnt;
    static int[] coin;
    static int[] dy;

    private static void solution() {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i=0; i < coinCnt; i++) {
            for (int j=coin[i]; j < change+1; j++ ) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        coinCnt = in.nextInt();
        coin = new int[coinCnt];
        for (int i = 0; i < coinCnt; i++) {
            coin[i] = in.nextInt();
        }
        change = in.nextInt();
        dy = new int[change +1];

        solution();
        System.out.println(dy[change]);
    }

}
