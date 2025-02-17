package exam;

import java.util.Scanner;

public class exam9_answer {

    private static int solution(String str) {
        String answer = "";

        char[] charArray = str.toCharArray();

        for (char t: charArray) {
            if (Character.isDigit(t)) {
                answer += t;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }


}
