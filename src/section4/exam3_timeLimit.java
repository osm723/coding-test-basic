package section4;

import java.util.Scanner;

public class exam3_timeLimit {

    private static int solution(int input2, int[] inputArr) {
        int range = input2;
        int max = 0;

        for (int i = 0; i < inputArr.length; i++) {
            int sum = 0;
            if (inputArr.length - range >= i) {
                for (int j = i; j < range+i; j++) {
                    sum += inputArr[j];
                }
            }

            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];
        for (int i = 0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.println(solution(input2, inputArr));
    }

}
