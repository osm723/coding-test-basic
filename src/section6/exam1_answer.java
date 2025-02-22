package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam1_answer {

    private static String solution(String input1) {
        String answer = "YES";
        int cnt = 0;

        char[] array = input1.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : array) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.print(solution(input1));
    }

}
