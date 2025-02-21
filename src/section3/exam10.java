package section3;

import java.util.Scanner;

public class exam10 {

    private static int solution(int input1, int[][] input2) {
        int answer = 0;

        for (int i = 1; i < input2.length; i++) {
            int[] ints = input2[i];

            for (int j = 1; j < ints.length; j++) {
                int num = input2[i][j];
                if (num > input2[i][j-1] && num > input2[i][j+1] && num > input2[i-1][j] && num > input2[i+1][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int x = input1 + 2;
        int y = input1 + 2;
        int z = input1 + 1;
        int[][] input2 = new int[x][y];

        for (int i=1; i < z; i++) {
            for (int j = 1; j < z; j++) {
                input2[i][j] = in.nextInt();
            }
        }



        System.out.print(solution(input1, input2));
    }

}
