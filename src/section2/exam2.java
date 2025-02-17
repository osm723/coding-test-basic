package section2;

import java.util.Scanner;

public class exam2 {

    private static String solution(String input1) {
        String answer = "";
        char[] charArray = input1.toCharArray();

        for (char t1 : charArray) {
            if (Character.isUpperCase(t1)) {
                answer += Character.toString(t1).toLowerCase();
            } else {
                answer += Character.toString(t1).toUpperCase();
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }

}
