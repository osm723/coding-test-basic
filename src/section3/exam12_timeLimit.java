package section3;

import java.util.Scanner;

public class exam12_timeLimit {

    private static int solution(int input1, int input2, int[] inputArr) {
        int answer = 0;
        int[] inputArr2;

        for (int i = 0; i < inputArr.length; i++) {
            inputArr2 = inputArr.clone();

            int maxCnt = 0;
            for (int j = i; j < inputArr2.length; j++) {
                if (inputArr2[j] == 0) {
                    inputArr2[j] = 1;
                    maxCnt++;
                }

                if (maxCnt == input2) {
                    break;
                }
            }

            int cycleCnt = 0;
            for (int k = 0; k < inputArr.length; k++) {
                if (inputArr2[k] == 1) {
                    cycleCnt++;
                } else {
                    if (answer < cycleCnt) {
                        answer = cycleCnt;
                    }
                    cycleCnt = 0;
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
        for (int i=0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.print(solution(input1, input2, inputArr));
    }

}
