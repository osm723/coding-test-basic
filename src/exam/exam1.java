package exam;

import java.util.Scanner;

public class exam1 {

    private static int solution(String input1, String input2) {
        int answer = 0;

        char t2 = input2.toUpperCase().charAt(0);

        char[] charArray = input1.toUpperCase().toCharArray();
        for (char t1 : charArray) {
            if (t1 == t2) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }


}
