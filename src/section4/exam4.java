package section4;

import java.util.Scanner;

public class exam4 {

    private static int solution(int inputArrLength, int sumValue, int[] inputArr) {
        int answer = 0;

        for (int i=0; i < inputArrLength; i++) {
            int sum = inputArr[i];
            for (int j=i+1; j < inputArrLength; j++) {
                sum += inputArr[j];
                if (sum == sumValue) {
                    answer++;
                    break;
                } else if (sum > sumValue){
                    break;
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
