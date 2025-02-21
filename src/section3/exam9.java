package section3;

import java.util.Scanner;

public class exam9 {

    private static int solution(int input1, int[][] input2) {
        int answer = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < input1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            sum3 += input2[i][i];
            sum4 += input2[input1-1-i][input1-1-i];
            for (int j = 0; j < input1; j++) {
                sum1 += input2[i][j];
                sum2 += input2[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1= in.nextInt();
        int[][] input2 = new int[input1][input1];
        for (int i=0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                input2[i][j] = in.nextInt();
            }

        }

        System.out.print(solution(input1, input2));
    }

}
