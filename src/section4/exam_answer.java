package section4;

import java.util.Scanner;

public class exam_answer {

    private static int solution(int inputArrLength, int sumValue, int[] inputArr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt=0; rt < inputArrLength; rt++) {
            sum+=inputArr[rt];

            if (sum == sumValue) {
                answer++;
            }

            while (sum >= sumValue) {
                sum-=inputArr[lt++];
                if (sum == sumValue) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];
        for (int i = 0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2, inputArr));
    }

}
