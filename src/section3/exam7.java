package section3;

import java.util.Scanner;

public class exam7 {

    private static int solution(int input1, int[] input2) {
        int answer = 0;
        int plus = 0;

        for (int i=0; i < input1; i++) {
            if (input2[i] == 1) {
                answer = answer + 1 + plus;
                plus++;
            } else {
                plus = 0;
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
