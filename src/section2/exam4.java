package section2;

import java.util.Scanner;

public class exam4 {

    private static String solution(String input1) {
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder(input1);
        answer = stringBuilder.reverse().toString();

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=0; i<num; i++) {
            String input = in.next();
            System.out.println(solution(input));
        }
    }


}
