package section6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class exam7_answer {

    private static String solution(String input1, String input2) {
        String answer = "YES";
        char[] array1 = input1.toCharArray();
        Queue<Character> queue1 = new ArrayDeque<>();
        for (char c1 : array1) {
            queue1.offer(c1);
        }

        for (char c :input2.toCharArray()) {
            if (queue1.contains(c)) {
                if (queue1.poll() != c) {
                    return "NO";
                }
            }
        }

        if (!queue1.isEmpty()) {
            answer = "NO";
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
