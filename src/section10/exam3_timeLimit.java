package section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam3_timeLimit {

    private static void solution(int len, List<Time3> times) {
        int max = 0;
        //int cnt = 1;

        for (int i=0; i < len; i++) {
            int cnt = 1;
            int start = times.get(i).getStart();
            int end = times.get(i).getEnd();

            for (int j=i+1; j < len; j++) {
                //System.out.println(times.get(i).getStart() + "-" + times.get(i).getEnd() +"==" + end+">"+times.get(j).getStart() + "-" + times.get(j).getEnd());
                if (end > times.get(j).getStart()) {
                    cnt++;
                    max = Math.max(max, cnt);
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        List<Time3> times = new ArrayList<>();

        for (int i=0; i < input1; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            times.add(i, new Time3(s, e));
        }

        Collections.sort(times);

//        for (Time time : times) {
//            System.out.println(time.getStart() + "-" + time.getEnd());
//        }

        solution(input1, times);

    }

}

class Time3 implements Comparable<Time3> {
    int start;
    int end;

    public Time3(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }


    @Override
    public int compareTo(Time3 o) {
        return this.end-o.getEnd();
    }
}