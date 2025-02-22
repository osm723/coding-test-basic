package section6;

import java.util.Scanner;

public class exam1 {

    private static String solution(String input1) {
        String answer = "YES";
        int cnt = 0;

        char[] array = input1.toCharArray();

        for (char c : array) {
            if (c == '(') {
                cnt++;
            } else if (c == ')') {
                cnt--;
            }

            if (cnt < 0) {
                return "NO";
            }
        }

        if (cnt != 0) {
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
