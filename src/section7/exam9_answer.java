package section7;

import java.util.Arrays;
import java.util.Scanner;

public class exam9_answer {

    private static int solution(int totalSize, int divSize, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt)/2;
            int sum = 0;
            int cnt = 1;

            for (int x : arr) {
                if (sum+x > mid) {
                    cnt++;
                    sum = x;
                } else {
                    sum += x;
                }
            }

            if (cnt <= divSize) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int[] inputArr = new int[input1];
        for (int i=0; i < input1; i++) {
            inputArr[i] = in.nextInt();
        }

        System.out.println(solution(input1, input2, inputArr));
    }

}
