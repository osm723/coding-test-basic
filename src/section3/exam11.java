package section3;

import java.util.Scanner;

public class exam11 {

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < n+1 ; i++) {
            int cnt = 0;
            for (int j = 1; j < n+1 ; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] input2 = new int[input1+1][6];

        for (int i = 1; i < input1+1; i++) {
            for (int j = 1; j < 6; j++) {
                input2[i][j] = in.nextInt();
            }
        }

        System.out.print(solution(input1, input2));
    }

}
