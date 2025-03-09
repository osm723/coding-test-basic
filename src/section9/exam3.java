package section9;

import java.util.Scanner;

public class exam3 {

    static int examCnt;
    static int maxTime;
    static int maxScore;
    static int[] scoreArr;
    static int[] timeArr;

    private static void DFS(int L, int sumScore, int sumTime) {
        if (maxTime < sumTime) {
            return;
        }

        if (L == examCnt) {
            maxScore = Math.max(maxScore, sumScore);
        } else {
            DFS(L+1, sumScore+scoreArr[L+1], sumTime+timeArr[L+1]);
            DFS(L+1, sumScore, sumTime);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        scoreArr = new int[input1+1];
        timeArr = new int[input1+1];
        for (int i=1; i < input1+1; i++) {
            // 점수 : 푸는시간
            scoreArr[i] = in.nextInt();
            timeArr[i] = in.nextInt();
        }

        examCnt = input1;
        maxTime = input2;

        DFS(0, 0, 0);
        System.out.println(maxScore);
    }

}
