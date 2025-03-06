package section7;

import java.util.Arrays;
import java.util.Scanner;

public class exam10_answer {

    private static int solution(int houseCnt, int horseCnt, int[] houseArr) {
        int answer = 0;
        Arrays.sort(houseArr);
        int lt = 1;
        int rt = houseArr[houseCnt-1];

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            int cnt = 1;
            int startP = houseArr[0];

            for (int i=1; i < houseArr.length; i++) {
                if (houseArr[i]-startP >= mid) {
                    cnt++;
                    startP = houseArr[i];
                }
            }

            if (cnt >= horseCnt) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
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
