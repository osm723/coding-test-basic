package section2;

import java.util.Scanner;

public class exam9 {

    private static int solution(String str) {
        int answer = 0;

        char[] charArray = str.toCharArray();
        for (char t: charArray) {
            if (t >= 48 && t <= 57) {
                answer = 10 * answer + Integer.parseInt(String.valueOf(t));
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }

}
