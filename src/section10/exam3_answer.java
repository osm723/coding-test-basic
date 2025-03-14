package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam3_answer {

    private static void solution(int len, List<Time2> times) {
        int max = 0;
        int cnt = 0;
        for (Time2 time : times) {
            time.getTime();
            char status = time.getStatus();

            if ("E".equals(String.valueOf(status))) {
                cnt--;
            } else {
                cnt++;
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        List<Time2> times = new ArrayList<>();

        for (int i=0; i < input1; i++) {
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            times.add(new Time2(s1, 'S'));
            times.add(new Time2(s2, 'E'));
            //times.add(i, new Time2(s1, 'S'));
            //times.add(i, new Time2(s2, 'E'));
        }

        Collections.sort(times);

//        for (Time2 time : times) {
//            System.out.println(time.getTime() + "-" + time.getStatus());
//        }

        solution(input1, times);

    }

}

class Time2 implements Comparable<Time2> {
    int time;
    char status;

    public Time2(int time, char status) {
        this.time = time;
        this.status = status;
    }

    public int getTime() {
        return time;
    }

    public char getStatus() {
        return status;
    }

    @Override
    public int compareTo(Time2 o) {
        if (this.time == o.getTime()) {
            return this.status-o.getStatus();
        } else {
            return this.time-o.getTime();
        }
    }
}
