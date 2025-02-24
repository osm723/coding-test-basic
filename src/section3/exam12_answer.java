package section3;

import java.util.Scanner;

public class exam12_answer {

    private static int solution(int studentCnt, int testCnt, int[][] inputArr) {
        int answer = 0;

        for (int i=1; i <= studentCnt; i++) {
            for (int j = 1; j <= studentCnt; j++) {
                int cnt = 0;
                for (int k = 0; k < testCnt; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < studentCnt; s++) {
                        if (inputArr[k][s] == i) {
                            pi = s;
                        }

                        if (inputArr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }

                if (cnt == testCnt) {
                    answer++;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[][] inputArr = new int[input2][input1];
        for (int i = 0; i < input2; i++) {
            for (int j = 0; j < input1; j++) {
                inputArr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(input1, input2, inputArr));
    }

}
