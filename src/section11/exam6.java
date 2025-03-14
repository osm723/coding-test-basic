package section11;

import java.util.ArrayList;
import java.util.Scanner;

public class exam6 {

    static int totalCnt;
    static int totalTime;
    static int answer = 0;
    static ArrayList<Exam> schedule;
    static int[] ch;

    private static void DFS(int L, int sumScore, int sumTime) {
        //System.out.println(L + ":" + (sumScore) + ":" + (sumTime));
        if (totalTime < sumTime) {
            return;
        }

        answer = Math.max(answer, sumScore);

        if (L == totalCnt) {
            return;
        } else {
            for (int i=0; i < totalCnt; i++) {
                int score = schedule.get(i).score;
                int time = schedule.get(i).time;

                if (totalTime < sumTime+time) {
                    return;
                } else if (ch[i] == 1) {
                    return;
                } else {
                    ch[i] = 1;
                    DFS(L+1, sumScore+score, sumTime+time);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        totalCnt = in.nextInt();
        totalTime = in.nextInt();
        schedule = new ArrayList<>();
        ch = new int[totalCnt];
        for (int i = 0; i < totalCnt; i++) {
            int score = in.nextInt();
            int time = in.nextInt();
            schedule.add(new Exam(score, time));
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }

}

class Exam {
    int score;
    int time;

    public Exam(int score, int time) {
        this.score = score;
        this.time = time;
    }
}