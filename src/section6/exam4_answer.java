package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam4_answer {

    private static int solution(String input1) {
        int answer = 0;
        Stack<Integer> stackNum = new Stack<>();

        for (char c : input1.toCharArray()) {
            if (c == '+') {
                Integer num1 = stackNum.pop();
                Integer num2 = stackNum.pop();
                stackNum.push(num2 + num1);
            } else if (c == '-') {
                Integer num1 = stackNum.pop();
                Integer num2 = stackNum.pop();
                stackNum.push(num2 - num1);
            } else if (c == '*') {
                Integer num1 = stackNum.pop();
                Integer num2 = stackNum.pop();
                stackNum.push(num2 * num1);
            } else if (c == '/') {
                Integer num1 = stackNum.pop();
                Integer num2 = stackNum.pop();
                stackNum.push(num2 / num1);
            } else {
                stackNum.push(Integer.parseInt(String.valueOf(c)));
                //stackNum.push(c-48);
            }
        }

        answer = stackNum.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(solution(input1));
    }

}
