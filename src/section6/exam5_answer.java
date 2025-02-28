package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam5_answer {

    private static int solution(String input1) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = input1.toCharArray();

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else {
                if (arr[i-1] == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(solution(input1));
    }
}
