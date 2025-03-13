package section10;

import java.util.*;

public class exam4 {

    static int maxDay = 0;

    private static int solution(int len, List<Lecture> lectures) {
        int answer = 0;
        //Collections.sort(lectures, Collections.reverseOrder());
        Queue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int k=maxDay; k > 0; k--) {
            for (int i=0; i < len; i++) {
                int day = lectures.get(i).day;
                int money = lectures.get(i).money;
                if (k == day) {
                    pQ.offer(money);
                }
            }

            if (!pQ.isEmpty()) {
                int pay = pQ.poll();
                answer += pay;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        List<Lecture> lectures = new ArrayList<>();

        for (int i=0; i < input1; i++) {
            int money = in.nextInt();
            int day = in.nextInt();
            lectures.add(new Lecture(money, day));
            maxDay = Math.max(day, maxDay);
        }

        System.out.println(solution(input1, lectures));
    }

}

class Lecture implements Comparable<Lecture>{
    int money;
    int day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return this.day-o.day;
    }


}
