package section6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class exam7 {

    private static String solution(String input1, String input2) {
        String answer = "NO";
        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();
        Queue<Character> queue1 = new ArrayDeque<>();
        Queue<Character> queue2 = new ArrayDeque<>();
        for (char c1 : array1) {
            queue1.offer(c1);
        }
        for (char c2 : array2) {
            queue2.offer(c2);
        }

        while (!queue2.isEmpty()) {
            if (queue1.peek() == queue2.peek()) {
                queue1.poll();
                queue2.poll();
            } else {
                queue2.poll();
            }
        }

        if (queue1.isEmpty()) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.print(solution(input1, input2));
    }

}
