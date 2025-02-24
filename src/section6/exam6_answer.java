package section6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam6_answer {

    private static int solution(int input1, int input2) {
        int answer = 0;
        int cnt = 0;

        Queue<Integer> queue = new LinkedList<>();


        for (int i = 1; i < input1+1; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            cnt++;
            if (cnt == input2) {
                queue.poll();
                cnt=0;
            } else {
                queue.offer(queue.poll());
            }

            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        System.out.print(solution(input1, input2));
    }

}
