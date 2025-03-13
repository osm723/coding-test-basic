package section11;

import java.util.Scanner;

public class exam1_answer {

    static int[] dy;

    private static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i=3; i< n+1; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        dy = new int[input1 + 1];

        System.out.println(solution(input1));
    }

}
