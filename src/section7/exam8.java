package section7;

import java.util.Arrays;
import java.util.Scanner;

public class exam8 {

    private static int solution(int input1, int input2, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = input1;
        int mt = 0;
        Arrays.sort(arr);

        for (int i=0; i < input1; i++) {
            mt = (lt+rt)/2;
            ;
            if (arr[mt] < input2) {
                lt=mt;
            } else if (arr[mt] > input2) {
                rt=mt;
            } else if (arr[mt] == input2) {
                return mt+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];

        for (int i=0; i<input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2, inputArr));
    }

}
