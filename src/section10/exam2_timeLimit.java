package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam2_timeLimit {

    private static void solution(int len, List<Time> schedule) {
        int maxCnt = 0;

        for (int i=0; i < len; i++) {
            int cnt = 1;
            Time cSchedule = schedule.get(i);
            int cStart = cSchedule.getStart();
            int cEnd = cSchedule.getEnd();

            for (int j=i+1; j < len; j++) {
                if (cEnd <= schedule.get(j).getStart()) {
                    //System.out.println(cStart + "-" + cEnd + "<" + schedule.get(j).getStart() + "-" + schedule.get(j).getEnd());
                    cEnd = schedule.get(j).getEnd();
                    cnt++;
                }
            }
            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.println(maxCnt);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        List<Time> schedule = new ArrayList<>();

        for (int i=0; i < input1; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            schedule.add(i, new Time(start, end));
        }

        Collections.sort(schedule);
        solution(input1, schedule);

    }

}


