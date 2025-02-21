package section3;

import java.util.Scanner;

public class exam6 {

    private static String solution(int input1, int[] input2) {
        String answer = "";
        int cnt = 0;

        for (int in: input2) {
            StringBuffer sb = new StringBuffer(String.valueOf(in)).reverse();
            int reverseInt = Integer.parseInt(sb.toString());
            if (reverseInt >= 2) {
                for (int i=2; i < reverseInt; i++) {
                    if (reverseInt % i == 0) {
                        cnt++;
                    }
                }

                if (cnt == 0) {
                    answer += reverseInt + " ";
                }
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();
        int[] input2 = new int[input1];
        for (int i=0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2));
    }

}
