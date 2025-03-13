package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam2 {

    private static void solution(int len, List<Time> schedule) {
        int maxCnt = 0;
        int endTime = 0;

        for (Time time : schedule) {
            if (endTime <= time.getStart()) {
                maxCnt++;
                endTime = time.getEnd();
            }
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
