package section6;

import java.util.Scanner;
import java.util.Stack;

public class exam2 {

    private static String solution(String input1) {
        String answer = "";

        char[] array = input1.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : array) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    answer += c;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.print(solution(input1));
    }

}
