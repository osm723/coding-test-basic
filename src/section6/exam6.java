package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam6 {

    private static int solution(int input1, int input2) {
        int answer = 0;
        int cnt = 1;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = input1; i > 0; i--) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            if (cnt == input2) {
                answer = stack.pop();
                cnt = 1;
            } else {
                stack2.push(stack.pop());
                cnt++;
            }

            if (stack.isEmpty()) {
                while (!stack2.isEmpty()) {
                    stack.push(stack2.pop());
                }
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
